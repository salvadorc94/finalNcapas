package com.uca.rustic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.rustic.domain.Usuario;
import com.uca.rustic.repositories.UsuarioRepository;

@Controller
public class loginController {
	
	@Autowired
	public UsuarioRepository usuariorepository;

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
			List<Usuario> results = usuariorepository.findByUsuarioAndClave(user.getUsuario(), user.getClave());
			if(results.size()==1) {
				//mav.setViewName("asd");
			}else {
				mav.addObject("mal","Invalid Credentials");
				mav.setViewName("login");
			}
		}
		return mav;
	}
	
}
