package com.project.dao;

import java.util.List;

import com.project.model.RequiredDocVO;


public interface RequiredDocDAO {
	void insertRequiredDoc(RequiredDocVO requiredDocVO);
	
	List<RequiredDocVO> searchRequiredDoc();
	
	List<RequiredDocVO> getByIdRequiredDoc(int id);
}
