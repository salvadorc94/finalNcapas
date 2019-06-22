package com.uca.rustic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.rustic.domain.Usuario;
import com.uca.rustic.services.SucursalServiceImp;

public class sucursalController {

	@Autowired
	public SucursalServiceImp sucursalService;
	
	@RequestMapping("/del")
	public ModelAndView del() {
		ModelAndView mav = new ModelAndView();
		
		
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
