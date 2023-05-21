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
import com.project.service.AccountTypeService;

@Controller
public class AccountTypeController {

	@Autowired
	private AccountTypeService accountTypeService;
	
	@GetMapping(value="admin/addAccountType")
	public ModelAndView addAccount(){
		return new ModelAndView("admin/addAccountType","AccountTypeVO",new AccountTypeVO());
	}
	
	@PostMapping(value="admin/insertAccoutType")
	public ModelAndView insertAccoutType(@ModelAttribute AccountTypeVO accountTypeVO){
		
		this.accountTypeService.insertAccountType(accountTypeVO);
		return new ModelAndView("admin/addAccountType","AccountTypeVO",new AccountTypeVO());
	}
	
	@GetMapping(value="admin/viewAccountType")
	public ModelAndView viewAccountType(){
		
		List<AccountTypeVO> searchAccountTypeList = this.accountTypeService.searchAccountType();
		
		return new ModelAndView("admin/viewAccountType","searchAccountTypeList",searchAccountTypeList);
	}
	
	@GetMapping(value="admin/deleteAccountType")
	public ModelAndView deleteAccountType(@ModelAttribute AccountTypeVO accountTypeVO,@RequestParam int id){
		
		List<AccountTypeVO> deleteListAccountType = this.accountTypeService.getByIdAccountType(id);
		accountTypeVO = deleteListAccountType.get(0);
		accountTypeVO.setStatus(false);
		
		this.accountTypeService.insertAccountType(accountTypeVO);
		
		return new ModelAndView("redirect:viewAccountType");
	}
	
	@GetMapping(value="admin/editAccountType")
	public ModelAndView editAccountType(@RequestParam int id){
		
		List<AccountTypeVO> editListAccountType = this.accountTypeService.getByIdAccountType(id);
		
		return new ModelAndView("admin/addAccountType","AccountTypeVO",editListAccountType.get(0));
	}
} 
