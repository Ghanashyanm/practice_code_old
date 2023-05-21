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
import com.VO.CountryVO;

@Controller
public class CountryController {
	
	@Autowired
	private CountryDAO countryDAO;
	
	@RequestMapping(value="loadCountry.html",method=RequestMethod.GET)
	public ModelAndView loadCountry()
	{
		return new ModelAndView("AddCountry","countryVO",new CountryVO());
	}
	
	@RequestMapping(value="insertCountry.html",method=RequestMethod.POST)
	public ModelAndView insertCountry(@ModelAttribute CountryVO countryVO)
	{
		countryDAO.insertCountry(countryVO);
		return new ModelAndView("redirect:/loadCountry.html");
	}
	
	@RequestMapping(value="searchCountry.html",method=RequestMethod.GET)
	public ModelAndView searchCountry()
	{
		List countryData = countryDAO.searchCountry();
		return new ModelAndView("SearchCountry","countryData",countryData);
	}
	@RequestMapping(value="deleteCountry.html",method=RequestMethod.GET)
	public ModelAndView deleteCountry(@ModelAttribute CountryVO countryVO,@RequestParam int id)
	{
		countryVO.setId(id);
		countryDAO.deleteCountry(countryVO);
		return new ModelAndView("redirect:/searchCountry.html");
	}
	@RequestMapping(value="editCountry.html",method=RequestMethod.GET)
	public ModelAndView editCountry(@ModelAttribute CountryVO countryVO,@RequestParam int id)
	{
		countryVO.setId(id);
		List editList = countryDAO.editCountry(countryVO);
		
		return new ModelAndView("AddCountry","countryVO",editList.get(0));
	}
	
}
