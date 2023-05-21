package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.VO.FormVO;

@Controller
public class FormController {
	
	
	@RequestMapping(value = "Register.html", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("Register","data",new FormVO());
	}
	@RequestMapping(value = "Welcome.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute FormVO v)
	{
		return new ModelAndView("Welcome","k",v);	
	}
	
}
