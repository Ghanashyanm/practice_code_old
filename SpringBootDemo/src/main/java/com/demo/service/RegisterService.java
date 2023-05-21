package com.demo.service;

import java.util.List;

import com.demo.model.RegisterVO;

public interface RegisterService {
	 void insert(RegisterVO regVO);
	 List<RegisterVO> search();
	 List<RegisterVO> getById(int id);
}