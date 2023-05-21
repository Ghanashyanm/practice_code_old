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
import com.project.model.LoanVO;
import com.project.service.LoanService;
import com.project.service.LoanTypeService;

@Controller
public class LoanController {
	
	@Autowired
	private LoanTypeService loanTypeService;
	
	@Autowired
	private LoanService loanService;
	
	@GetMapping(value="admin/addLoan")
	public ModelAndView addLoan(){
		
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();
		return new ModelAndView("admin/addLoan","LoanVO",new LoanVO()).addObject("loanTypeList",loanTypeList);
	}
	
	@PostMapping(value="admin/saveLoan")
	public ModelAndView saveLoan(@ModelAttribute LoanVO loanVO){
		
		this.loanService.insertLoan(loanVO);
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();
		return new ModelAndView("admin/addLoan","LoanVO",new LoanVO()).addObject("loanTypeList",loanTypeList);
	}
	
	@GetMapping(value="admin/viewLoan")
	public ModelAndView viewLoan(){
		List<LoanVO> searchLoanList = this.loanService.searchLoan();
		return new ModelAndView("admin/viewLoan","searchLoanList",searchLoanList);
	}
	
	@GetMapping(value="admin/deleteLoan")
	public ModelAndView deleteLoan(@ModelAttribute LoanVO loanVO,@RequestParam int id){
		
		List<LoanVO> deleteListLoan = this.loanService.getByIdLoan(id);
		loanVO = deleteListLoan.get(0);
		loanVO.setStatus(false);
		
		this.loanService.insertLoan(loanVO);
		
		return new ModelAndView("redirect:viewLoan");
	}
	
	@GetMapping(value="admin/editLoan")
	public ModelAndView editLoan(@RequestParam int id){
		
		List<LoanVO> editListLoan = this.loanService.getByIdLoan(id);
		List<LoanTypeVO> loanTypeList = this.loanTypeService.searchLoanType();
		return new ModelAndView("admin/addLoan","LoanVO",editListLoan.get(0)).addObject("loanTypeList",loanTypeList);
	}
}
