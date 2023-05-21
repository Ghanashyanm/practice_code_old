package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.LoanTypeVO;
import com.project.service.LoanTypeService;

@Controller
public class LoanTypeController {
	
	@Autowired
	private LoanTypeService loanTypeService;
	
	@GetMapping(value="admin/addTypeLoan")
	public ModelAndView addLoanType()
	{
		return new ModelAndView("admin/addLoanType","LoanTypeVO",new LoanTypeVO());
	}
	
	@PostMapping(value="admin/insertLoanType")
	public ModelAndView insertLoanType(@ModelAttribute LoanTypeVO loanTypeVO){
		
		this.loanTypeService.insertLoanType(loanTypeVO);
		return new ModelAndView("admin/addLoanType","LoanTypeVO",new LoanTypeVO());
	}
	
	@GetMapping(value="admin/viewTypeLoan")
	public ModelAndView viewLoanType(){
		
		List<LoanTypeVO> searchLoanTypeList = this.loanTypeService.searchLoanType();
		
		return new ModelAndView("admin/viewLoanType","searchLoanTypeList",searchLoanTypeList);
	}
	
	@GetMapping(value="admin/deleteLoanType")
	public ModelAndView deleteLoanType(@ModelAttribute LoanTypeVO loanTypeVO,@RequestParam int id){
		
		List<LoanTypeVO> deleteListLoanType = this.loanTypeService.getByIdLoanType(id);
		loanTypeVO = deleteListLoanType.get(0);
		loanTypeVO.setStatus(false);
		
		this.loanTypeService.insertLoanType(loanTypeVO);
		
		return new ModelAndView("redirect:viewTypeLoan");
	}
	
	@GetMapping(value="admin/editLoanType")
	public ModelAndView editLoanType(@RequestParam int id){
		
		List<LoanTypeVO> editListLoanType = this.loanTypeService.getByIdLoanType(id);
		
		return new ModelAndView("admin/addLoanType","LoanTypeVO",editListLoanType.get(0));
	}
}
