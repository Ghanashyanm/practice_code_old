package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.CountryDAO;
import com.DAO.StateDAO;
import com.VO.CountryVO;
import com.VO.StateVO;


@Controller
public class StateController {
	@Autowired
	private StateDAO stateDAO;
	@Autowired
	private CountryDAO countryDAO;
	
	@RequestMapping(value="loadState.html",method=RequestMethod.GET)
	public ModelAndView CountryList(@ModelAttribute CountryDAO countryDAO)
	{
		
		System.out.println("state Controller:::");
		List searchList=this.countryDAO.searchCountry();
		System.out.println(searchList.size());
		return new ModelAndView("StateRegister","stateVO",new StateVO()).addObject("editList", searchList);	
	}
	@RequestMapping(value="insertState.html",method=RequestMethod.POST)
	public ModelAndView insertState(@ModelAttribute StateVO stateVO)
	{
		
		stateDAO.insertState(stateVO);
		return new ModelAndView("redirect:/loadState.html");
	}
	@RequestMapping(value="searchState.html",method=RequestMethod.GET)
	public ModelAndView searchState()
	{
		
		List searchList=stateDAO.searchState();
		return new ModelAndView("SearchState","SearchList",searchList);
	}
	@RequestMapping(value="deleteState.html",method =RequestMethod.GET)
	public ModelAndView Delete(@ModelAttribute StateVO stateVO,@RequestParam int id)
	{
		stateVO.setId(id);
		stateDAO.deleteState(stateVO);
		return new ModelAndView("redirect:/searchState.html");	
	}
	@RequestMapping(value="editState.html",method =RequestMethod.GET)
	public ModelAndView Edit(@ModelAttribute StateVO stateVO,@ModelAttribute CountryVO countryVO,@RequestParam int id)
	{
		List editList1 = countryDAO.searchCountry();
		stateVO.setId(id);
		List editList = stateDAO.editState(stateVO);
		return new ModelAndView("StateRegister","stateVO",editList.get(0)).addObject("editList",editList1);
	}

	
}
