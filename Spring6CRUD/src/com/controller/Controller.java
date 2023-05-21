package com.controller;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.RegDAO;
import com.VO.RegVO;

import java.util.List;
import java.util.ArrayList;

@org.springframework.stereotype.Controller

public class Controller {

	@Autowired
	private RegDAO d;
	@RequestMapping(value="index.html" , method = RequestMethod.GET)

	public ModelAndView index()
	{
		return new ModelAndView("Insert","insertData",new RegVO() );
	}
	
	@RequestMapping(value="insert.html",method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute RegVO v)
	{
		d.insert(v);
		return new ModelAndView("redirect:/search.html");
	}
	
	@RequestMapping(value="search.html",method=RequestMethod.GET)
	public ModelAndView search()
	{
		List<RegVO> searchList = d.search();
		return new ModelAndView("view","SearchList",searchList);
	}
	@RequestMapping(value="delete.html",method=RequestMethod.GET)
	public ModelAndView delete(@RequestParam int id,RegVO v)
	{
		System.out.println(id);
		v.setId(id);
		d.delete(v);
		return new ModelAndView("redirect:/search.html");
	}
	@RequestMapping(value="edit.html",method=RequestMethod.GET)
	public ModelAndView edit(@RequestParam int id,RegVO v)
	{
		System.out.println(id);
		v.setId(id);
		List editList  = d.edit(v);
		return new ModelAndView("Insert","insertData",editList.get(0));
	}
}
