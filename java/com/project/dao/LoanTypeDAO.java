package com.project.dao;

import java.util.List;

import com.project.model.LoanTypeVO;

public interface LoanTypeDAO {
void insertLoanType(LoanTypeVO loanTypeVO);
	
	List<LoanTypeVO> searchLoanType();
	
	List<LoanTypeVO> getByIdLoanType(int id);
}
