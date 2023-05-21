package com.project.dao;

import java.util.List;

import com.project.model.AccountTypeVO;


public interface AccountTypeDAO {
	void insertAccoutType(AccountTypeVO accountTypeVO);
	
	List<AccountTypeVO> searchAccountType();
	
	List<AccountTypeVO> getByIdAccountType(int id);
}