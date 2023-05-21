package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(value="Hello.html",method = RequestMethod.GET)
	public ModelAndView Load()
	{
		System.out.println("controller");
		String msg ="This Is Spring Demo::::::";
		return new ModelAndView("SP","msg",msg);
		
	}
}
