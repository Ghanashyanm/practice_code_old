package com.project.dao;

import java.util.List;

import com.project.model.LoanVO;

public interface LoanDAO {
	void insertLoan(LoanVO loanVO);
	
	List<LoanVO> searchLoan();
	
	List<LoanVO> getByIdLoan(int id);
}
