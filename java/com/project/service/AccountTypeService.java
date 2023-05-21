package com.project.service;

import java.util.List;

import com.project.model.AccountTypeVO;

public interface AccountTypeService {
	void insertAccountType(AccountTypeVO accountTypeVO);
	
	List<AccountTypeVO> searchAccountType();
	
	List<AccountTypeVO> getByIdAccountType(int id);
}
