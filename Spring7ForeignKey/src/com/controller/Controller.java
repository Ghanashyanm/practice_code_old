package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.LoginDAO;
import com.DAO.RegDAO;
import com.VO.RegVO;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private RegDAO registerDAO ;
	
	@Autowired
	private LoginDAO loginDAO ;

	@RequestMapping(value = "register.html",  method = RequestMethod.GET )
	public ModelAndView LoadReg(){
		
		return new ModelAndView("Register","formfield", new RegVO());
	}
		
	@RequestMapping(value = "insert.html" , method = RequestMethod.POST)
	public ModelAndView Save(@ModelAttribute RegVO registerVO){
		
		loginDAO.insertOrUpdate(registerVO.getLoginVO());
		registerDAO.insertOrUpdate(registerVO);
		
		return new ModelAndView("redirect:/search.html");
	}
	
	@RequestMapping(value = "search.html" , method = RequestMethod.GET)
	public ModelAndView Display(){
		
		List<RegVO> data = registerDAO.display();
		
		return new ModelAndView("Search","data",data);
	}
	
	@RequestMapping(value = "delete.html" , method = RequestMethod.GET)
	public ModelAndView Delete(@RequestParam int id , RegVO registerVO){
		
		registerVO.setId(id);
		List registervo = registerDAO.edit(registerVO);
		registerVO = (RegVO)registervo.get(0);
		registerDAO.delete(registerVO);
		loginDAO.delete(registerVO.getLoginVO());
		
		return new ModelAndView("redirect:/search.html");
	}
	
	@RequestMapping(value = "edit.html" , method = RequestMethod.GET)
	public ModelAndView Edit(@RequestParam int id , RegVO registerVO){
		
		registerVO.setId(id);
		
		List<RegVO> editlist = registerDAO.edit(registerVO);
		
		return new ModelAndView("Register","formfield",editlist.get(0));
	}
}
