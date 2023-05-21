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
import com.demo.service.RegisterService;

@Controller
public class CountryController {
	@Autowired
	private RegisterService regsiterService;
	
	
	@GetMapping(value="/")
	public ModelAndView loadCountry()
	{
		return new ModelAndView("Menu");
	}
	
	@GetMapping(value="addCountry")
	public ModelAndView Country()
	{
		return new ModelAndView("AddCountry","countryvo",new Countryvo());
	}
	
	@PostMapping(value="insertCountry")
	public ModelAndView insertCountry(@ModelAttribute Countryvo countryvo)
	{
		this.regsiterService.insertCountry(countryvo);
		return new ModelAndView("redirect:/addCountry");
	}
	
	@GetMapping(value="searchCountry")
	public ModelAndView searchCountry()
	{
		List<Countryvo> countryData = this.regsiterService.searchCountry();
		return new ModelAndView("SearchCountry","countryData",countryData);
	}
	
	@GetMapping(value="deleteCountry")
	public ModelAndView deleteCountry(@ModelAttribute Countryvo countryvo,@RequestParam int id)
	{
		List<Countryvo> deleteList = this.regsiterService.getByIdCountry(id);
		countryvo = deleteList.get(0);
		countryvo.setStatus(false);
		this.regsiterService.insertCountry(countryvo);
		return new ModelAndView("redirect:/searchCountry");
	}
	
	@GetMapping(value="editCountry")
	public ModelAndView editCountry(@ModelAttribute Countryvo countryvo,@RequestParam int id)
	{
		List<Countryvo> editList = this.regsiterService.getByIdCountry(id);
		return new ModelAndView("AddCountry","countryvo",editList.get(0));
	}
	
	@GetMapping(value="menu")
	public ModelAndView menu()
	{
		return new ModelAndView("redirect:/");
	}
}
