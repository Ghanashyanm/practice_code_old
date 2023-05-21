package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.DocumentDAO;
import com.project.model.DocumentVO;

@Service
@Transactional
public class DocumentServiceImpl implements DocumentService{
	@Autowired
	private DocumentDAO documentDAO;
	
	@Override
	public void insertDocument(DocumentVO documentVO) {
		this.documentDAO.insertDocument(documentVO);
	}
	
	@Override
	public List<DocumentVO> searchDocument() {
		return this.documentDAO.searchDocument();
	}
	
	@Override
	public List<DocumentVO> getByIdDocument(int id) {
		// TODO Auto-generated method stub
		return this.documentDAO.getByIdDocument(id);
	}
}
