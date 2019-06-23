package com.uca.rustic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.rustic.domain.Empleado;
import com.uca.rustic.domain.Sucursal;
import com.uca.rustic.services.SucursalService;

@Controller
public class sucursalController {

	@Autowired
	public SucursalService sucursalService;
	
	
	@RequestMapping("/sucursales")
	public ModelAndView sucursales() {
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.findAll();
		}catch(Exception e) {}
		mav.addObject("sucursales", sucursales);
		mav.setViewName("sucursales");
		return mav;
	}
	
	
	@RequestMapping("/e")
	public ModelAndView edit(@ModelAttribute Sucursal s, BindingResult result,@RequestParam("cbr") Integer code) {
			ModelAndView mav = new ModelAndView();
			Sucursal sucursal = null;
			try {
				sucursal = sucursalService.findOne(code);
			}catch(Exception e) {}
			mav.addObject("sucursal",sucursal);
			mav.setViewName("edit");
			return mav;
	}
	
	@RequestMapping("/n")
	public String add(@ModelAttribute Sucursal s, BindingResult result) {
		return "nueva";
	}
	
	@RequestMapping("/new")
	public ModelAndView setNew(@Valid @ModelAttribute Sucursal s, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("nueva");
		}else{
			try {
			sucursalService.insert(s);
			}catch(Exception e){}
			List<Sucursal> sucursales = null;
			try {
				sucursales = sucursalService.findAll();
			}catch(Exception e) {}
		
			mav.addObject("sucursales", sucursales);
			mav.setViewName("sucursales");
		}
		return mav;
	}
	
	@RequestMapping("/del")
	public ModelAndView del(@RequestParam("cbr") Integer code ) {
		try {
			sucursalService.delete(code);
		}catch(Exception e) {}
		
		ModelAndView mav = new ModelAndView();
		List<Sucursal> sucursales = null;
		try {
			sucursales = sucursalService.findAll();
		}catch(Exception e) {}
		mav.addObject("sucursales", sucursales);
		mav.setViewName("sucursales");
		return mav;
	}
	@RequestMapping("/edit")
	public ModelAndView edit(@Valid @ModelAttribute Sucursal s, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("edit");
		}else{
			try {
			sucursalService.insert(s);
			}catch(Exception e){}
			List<Sucursal> sucursales = null;
			try {
				sucursales = sucursalService.findAll();
			}catch(Exception e) {}
	
			mav.addObject("sucursales", sucursales);
			mav.setViewName("sucursales");
		}
		return mav;
	}
	
	@RequestMapping("/view")
	public ModelAndView view(@RequestParam("cbr") Integer code) {
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = null;
		try {
			sucursal = sucursalService.findOne(code);
		}catch(Exception e) {}
		List<Empleado> empleados = sucursal.getEmpleados();
		mav.addObject("sucursal",sucursal);
		mav.addObject("empleados",empleados);
		mav.setViewName("empleados");
		return mav;
	}
}
