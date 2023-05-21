package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.AccountTypeVO;
import com.project.model.ScheduleOfChargesVO;
import com.project.service.AccountTypeService;
import com.project.service.ScheduleOfChargesService;

@Controller
public class ScheduleOfChargesTypeController {
	
	@Autowired
	private AccountTypeService accountTypeService;
	
	@Autowired
	private ScheduleOfChargesService scheduleOfChargesService; 
	
	@GetMapping(value = "admin/scheduleOfCharges")
	public ModelAndView loadScheduleOfCharges() {
		List<AccountTypeVO> accountTypeList = this.accountTypeService.searchAccountType();
		return new ModelAndView("admin/addScheduleOfCharges","ScheduleOfChargesVO",new ScheduleOfChargesVO()).addObject("accountTypeList", accountTypeList);
	}
	
	@PostMapping(value="admin/insertScheduleOfCharges")
	public ModelAndView insertScheduleOfCharges(@ModelAttribute ScheduleOfChargesVO scheduleOfChargesVO)
	{
		this.scheduleOfChargesService.insertScheduleOfCharges(scheduleOfChargesVO);
		return new ModelAndView("redirect:scheduleOfCharges");
	}
	
	@GetMapping(value="admin/viewScheduleOfCharges")
	public ModelAndView viewScheduleOfCharges()
	{
		List<ScheduleOfChargesVO> searchScheduleOfChargesList =  this.scheduleOfChargesService.searchScheduleOfCharges();
		return new ModelAndView("admin/viewScheduleOfCharges","searchScheduleOfChargesList",searchScheduleOfChargesList);
	}
	@GetMapping(value="admin/deleteScheduleOfCharges")
	public ModelAndView deleteScheduleOfCharges(@ModelAttribute ScheduleOfChargesVO scheduleOfChargesVO,@RequestParam int id){
		List<ScheduleOfChargesVO> deleteListScheduleOfCharges = this.scheduleOfChargesService.getByIdScheduleOfCharges(id);
		scheduleOfChargesVO = deleteListScheduleOfCharges.get(0);
		scheduleOfChargesVO.setStatus(false);
		this.scheduleOfChargesService.insertScheduleOfCharges(scheduleOfChargesVO);
		
		return new ModelAndView("redirect:viewScheduleOfCharges");
	}
	@GetMapping(value="admin/editScheduleOfCharges")
	public ModelAndView editScheduleOfCharges(@RequestParam int id)
	{
		List<ScheduleOfChargesVO> editScheduleOfChargesList = this.scheduleOfChargesService.getByIdScheduleOfCharges(id);
		List<AccountTypeVO> accountTypeList = this.accountTypeService.searchAccountType();
		return new ModelAndView("admin/addScheduleOfCharges","ScheduleOfChargesVO",editScheduleOfChargesList.get(0)).addObject("accountTypeList", accountTypeList);
	}
}