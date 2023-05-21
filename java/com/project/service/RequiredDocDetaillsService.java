package com.project.service;

import java.util.List;

import com.project.model.RequiredDocDetailsVO;
import com.project.model.RequiredDocVO;

public interface RequiredDocDetaillsService {
	void insertRequiredDocFile(RequiredDocDetailsVO requiredDocFileVO);
	
	List<RequiredDocDetailsVO> searchRequiredDocFile();
	
	List<RequiredDocDetailsVO> getByIdRequiredDocFile(int id);
}
