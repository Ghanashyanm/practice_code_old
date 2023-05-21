package com.project.service;

import java.util.List;

import com.project.model.LoanTypeVO;

public interface LoanTypeService {
void insertLoanType(LoanTypeVO loanTypeVO);
	
	List<LoanTypeVO> searchLoanType();
	
	List<LoanTypeVO> getByIdLoanType(int id);
}
