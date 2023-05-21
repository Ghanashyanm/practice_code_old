package com.project.dao;

import java.util.List;

import com.project.model.DocumentVO;

public interface DocumentDAO {
	void insertDocument(DocumentVO documentVO);
	
	List<DocumentVO> searchDocument();
	
	List<DocumentVO> getByIdDocument(int id);
}
