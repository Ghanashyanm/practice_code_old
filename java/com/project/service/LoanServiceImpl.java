package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoanDAO;
import com.project.model.LoanVO;

@Service
@Transactional
public class LoanServiceImpl implements LoanService{
	@Autowired
	private LoanDAO loanDAO;
	
	@Override
	public void insertLoan(LoanVO loanVO) {
		this.loanDAO.insertLoan(loanVO);
	}
	
	@Override
	public List<LoanVO> searchLoan() {
		return this.loanDAO.searchLoan();
	}
	
	@Override
	public List<LoanVO> getByIdLoan(int id) {
		// TODO Auto-generated method stub
		return this.loanDAO.getByIdLoan(id);
	}
}
