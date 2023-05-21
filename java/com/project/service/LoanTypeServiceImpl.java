package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanTypeDAO;
import com.project.model.LoanTypeVO;


@Service
@Transactional
public class LoanTypeServiceImpl implements LoanTypeService{
	@Autowired
	private LoanTypeDAO loanTypeDAO;
	
	@Override
	public void insertLoanType(LoanTypeVO loanTypeVO) {
		this.loanTypeDAO.insertLoanType(loanTypeVO);
	}
	
	@Override
	public List<LoanTypeVO> searchLoanType() {
		return this.loanTypeDAO.searchLoanType();
	}
	
	@Override
	public List<LoanTypeVO> getByIdLoanType(int id) {
		// TODO Auto-generated method stub
		return this.loanTypeDAO.getByIdLoanType(id);
	}
}
