package com.uca.rustic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.rustic.domain.Sucursal;
import com.uca.rustic.services.SucursalService;

@Controller
public class sucursalController {

	@Autowired
	public SucursalService sucursalService;
	
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
	public ModelAndView edit() {
		ModelAndView mav = new ModelAndView();
		
		
		return mav;
	}
	
	@RequestMapping("/view")
	public ModelAndView view() {
		ModelAndView mav = new ModelAndView();
		
		
		return mav;
	}
}
