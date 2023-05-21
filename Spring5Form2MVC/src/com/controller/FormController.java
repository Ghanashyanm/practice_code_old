package com.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.VO.LoginVO;
import com.VO.RegVO;

@Controller
public class FormController {
	@RequestMapping(value="Register.html",method = RequestMethod.GET)
	public ModelAndView register()
	{
		return new ModelAndView("Register","registerData",new RegVO());
	}
	
	@RequestMapping(value="Login.html",method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute RegVO r, HttpServletRequest request)
	{
		
		HttpSession session = request.getSession();
		session.setAttribute("r",r);
		return new ModelAndView("Login","loginData",new LoginVO());
	}
	
	@RequestMapping(value="Welcome.html",method = RequestMethod.POST)
	public ModelAndView verify(@ModelAttribute LoginVO l,HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		RegVO r =(RegVO)session.getAttribute("r");
		 String fn = r.getFn();
		 String ln = r.getLn();
		 String un = r.getUn();
		 String pwd = r.getPwd();
		 
		 System.out.println(fn);
		 System.out.println(un);
		 
		 String un1 = l.getUn1();
		 String pwd1 = l.getPwd1();
		 System.out.println(un1);
		 
		if(un.equals(un1) && pwd.equals(pwd1))
		{
			return new ModelAndView("Welcome","k",fn+" "+ln);
		}
		else
		{
			return new ModelAndView("Login","loginData",new LoginVO());
		}
	}
}
