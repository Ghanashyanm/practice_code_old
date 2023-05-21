package com.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@RequestMapping(value = "register.html", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("Form");
	}

	@RequestMapping(value = "1.html", method = RequestMethod.GET)
	public ModelAndView Load(HttpServletRequest request) {
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		return new ModelAndView("SP", "msg", fn + " " + ln);
	}

}