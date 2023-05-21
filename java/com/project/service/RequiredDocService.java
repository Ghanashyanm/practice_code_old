package com.project.service;

import java.util.List;

import com.project.model.RequiredDocVO;

public interface RequiredDocService {
void insertRequiredDoc(RequiredDocVO requiredDocVO);
	
	List<RequiredDocVO> searchRequiredDoc();
	
	List<RequiredDocVO> getByIdRequiredDoc(int id);
}
