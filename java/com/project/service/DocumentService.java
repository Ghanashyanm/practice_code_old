package com.project.service;

import java.util.List;

import com.project.model.DocumentVO;

public interface DocumentService {
	void insertDocument(DocumentVO documentVO);

	List<DocumentVO> searchDocument();

	List<DocumentVO> getByIdDocument(int id);

}
