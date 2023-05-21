package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.RequiredDocFileDAO;
import com.project.model.RequiredDocDetailsVO;

@Service
@Transactional
public class RequiredDocDetailsServiceImpl implements RequiredDocDetaillsService{

	@Autowired
	private RequiredDocFileDAO requiredDocFileDAO;

	@Override
	public void insertRequiredDocFile(RequiredDocDetailsVO requiredDocFileVO) {
		// TODO Auto-generated method stub
		this.requiredDocFileDAO.insertRequiredDocFile(requiredDocFileVO);
		
	}
	
	@Override
	public List<RequiredDocDetailsVO> searchRequiredDocFile() {
		// TODO Auto-generated method stub
		return this.requiredDocFileDAO.searchRequiredDocFile();
	}
	
	@Override
	public List<RequiredDocDetailsVO> getByIdRequiredDocFile(int id) {
		// TODO Auto-generated method stub
		return this.requiredDocFileDAO.getByIdRequiredDocFile(id);
	}

	
	
	

}
