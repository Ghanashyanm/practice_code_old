package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Countryvo;
import com.demo.model.Statevo;
import com.demo.service.RegisterService;

@Controller
public class StateController{
	
	@Autowired
	private RegisterService regsiterService;
	
	@GetMapping(value="addState")
	public ModelAndView CountryList()
	{
		List<Countryvo> searchList=this.regsiterService.searchCountry();
		
		return new ModelAndView("StateRegister","statevo",new Statevo()).addObject("countryList", searchList);	
	}
	@PostMapping(value="insertState")
	public ModelAndView insertState(@ModelAttribute Statevo statevo)
	{
		
		this.regsiterService.insertState(statevo);
		return new ModelAndView("redirect:/addState.html");
	}
	@GetMapping(value="searchState")
	public ModelAndView searchState()
	{
		List<Statevo> searchList=this.regsiterService.searchState();
		return new ModelAndView("SearchState","SearchList",searchList);
	}
	@GetMapping(value="deleteState")
	public ModelAndView Delete(@ModelAttribute Statevo statevo,@RequestParam int id)
	{
		 List<Statevo> deleteList = this.regsiterService.getByIdState(id);
		 statevo = deleteList.get(0);
		 statevo.setStatus(false);
		 this.regsiterService.insertState(statevo);
		return new ModelAndView("redirect:/searchState.html");	
	}
	@GetMapping(value="editState")
	public ModelAndView Edit(@ModelAttribute Statevo statevo,@ModelAttribute Countryvo countryvo,@RequestParam int id)
	{
		List<Countryvo> countryList = this.regsiterService.searchCountry();
		statevo.setId(id);
		List<Statevo> editList = this.regsiterService.getByIdState(id);
		return new ModelAndView("StateRegister","statevo",editList.get(0)).addObject("countryList",countryList);
	}
}
