package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.RequiredDocDAO;
import com.project.model.RequiredDocVO;

@Service
@Transactional
public class RequiredDocServiceImpl implements RequiredDocService{

	@Autowired
	private RequiredDocDAO requiredDocDAO;
	
	@Override
	public void insertRequiredDoc(RequiredDocVO requiredDocVO) {
		// TODO Auto-generated method stub
		this.requiredDocDAO.insertRequiredDoc(requiredDocVO);
	}

	@Override
	public List<RequiredDocVO> searchRequiredDoc() {
		// TODO Auto-generated method stub
		return this.requiredDocDAO.searchRequiredDoc();
	}

	@Override
	public List<RequiredDocVO> getByIdRequiredDoc(int id) {
		// TODO Auto-generated method stub
		return this.requiredDocDAO.getByIdRequiredDoc(id);
	}

}
