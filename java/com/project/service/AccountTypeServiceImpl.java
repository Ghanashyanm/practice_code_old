package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.AccountTypeDAO;
import com.project.model.AccountTypeVO;

@Service
@Transactional
public class AccountTypeServiceImpl implements AccountTypeService{

	@Autowired
	private AccountTypeDAO accountTypeDAO;
	
	@Override
	public void insertAccountType(AccountTypeVO accountTypeVO) {
		// TODO Auto-generated method stub
		this.accountTypeDAO.insertAccoutType(accountTypeVO);
	}
	
	@Override
	public List<AccountTypeVO> searchAccountType() {
		return this.accountTypeDAO.searchAccountType();
	}
	
	@Override
	public List<AccountTypeVO> getByIdAccountType(int id) {
		// TODO Auto-generated method stub
		return this.accountTypeDAO.getByIdAccountType(id);
	}

}
