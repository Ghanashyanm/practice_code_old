package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Loginvo;
import com.demo.model.Regvo;
import com.demo.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	private RegisterService regsiterService;
	
	@GetMapping(value="/")
	public ModelAndView loadRegister()
	{
		return new ModelAndView("Registration","Regvo",new Regvo());
	}
	
	@PostMapping(value="insert")
	public ModelAndView insertReg(@ModelAttribute Regvo regvo)
	{
		this.regsiterService.insert(regvo.getLoginvo());
		this.regsiterService.insert(regvo);
		return new ModelAndView("redirect:/");
	}
	@GetMapping(value = "search")
	public ModelAndView search()
	{
		List<Regvo> ls = this.regsiterService.search();
		return new ModelAndView("Search","searchList",ls);
	}
	@GetMapping(value="delete")
	public ModelAndView delete(@RequestParam int id, Regvo regvo)
	{
		List<Regvo> deleteList = this.regsiterService.getById(id);
		regvo = deleteList.get(0);
		regvo.setStatus(false);
		Loginvo loginvo = regvo.getLoginvo();
		loginvo.setStatus(false);
		this.regsiterService.insert(loginvo);
		this.regsiterService.insert(regvo);
		return new ModelAndView("redirect:/search");
	}
	@GetMapping(value="edit")
	public ModelAndView edit(@RequestParam int id, Regvo regvo)
	{
		
		List<Regvo> editList = this.regsiterService.getById(id);
		regvo = editList.get(0);
		return new ModelAndView("Registration","Regvo",regvo);
	}

}
