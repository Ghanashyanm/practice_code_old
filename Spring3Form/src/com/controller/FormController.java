package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@RequestMapping(value = "Register.html", method = RequestMethod.GET)
	public ModelAndView register() {
		return new ModelAndView("Register");
	}
	@RequestMapping(value = "Login.html", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		session.setAttribute("fn", request.getParameter("fn"));
		session.setAttribute("ln", request.getParameter("ln"));
		session.setAttribute("un", request.getParameter("un"));
		session.setAttribute("pwd", request.getParameter("pwd"));
		
		return new ModelAndView("Login");
	}
	@RequestMapping(value = "Verify.html", method = RequestMethod.POST)
	public ModelAndView verify(HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		String fn = (String) session.getAttribute("fn");
		String ln = (String) session.getAttribute("ln");
		String un = (String) session.getAttribute("un");
		String pwd = (String) session.getAttribute("pwd");
		
		System.out.println(fn);
		System.out.println(ln);
		System.out.println(un);
		System.out.println(pwd);
		
		String un1 = request.getParameter("un1");
		String pwd1 = request.getParameter("pwd1");
		
		System.out.println(un1);
		System.out.println(pwd1);
		
		if(un.equals(un1) && pwd.equals(pwd1))
		{
			
		return new ModelAndView("Welcome","msg","Welcome "+fn+" "+ln);
		}
		else
		{
			return new ModelAndView("Login");
		}
	}
}