package com.uca.rustic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.rustic.domain.Sucursal;
import com.uca.rustic.domain.Usuario;
import com.uca.rustic.services.SucursalServiceImp;
import com.uca.rustic.services.UsuarioServiceImp;

@Controller
public class loginController {

	@Autowired
	public UsuarioServiceImp usuarioService;
	@Autowired
	public SucursalServiceImp sucursalService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		Usuario user = new Usuario();
		mav.addObject("usuario",user);
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/login")
	public ModelAndView validarLogin(@Valid @ModelAttribute Usuario user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("login");
		}else{
			List<Usuario> results = null;
			
			try {
				results = usuarioService.findByUsuarioAndClave(user.getUsuario(), user.getClave());
			}catch (Exception e){
				
			}
			
			if(results.size()==1) {
				List<Sucursal> sucursales = null;
				try {
					sucursales = sucursalService.findAll();
				}catch(Exception e) {}
				mav.addObject("sucursales", sucursales);
				mav.setViewName("sucursales");
			}else {
				mav.addObject("mal","Invalid Credentials");
				mav.setViewName("login");
			}
		}
		return mav;
	}
	
}
