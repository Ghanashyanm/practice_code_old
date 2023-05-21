package com.project.service;

import java.util.List;


import com.project.model.LoanVO;


public interface LoanService {
void insertLoan(LoanVO loanVO);
	
	List<LoanVO> searchLoan();
	
	List<LoanVO> getByIdLoan(int id);
}
