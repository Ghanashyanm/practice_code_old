package com.demo.service;

import java.util.List;

import com.demo.model.Loginvo;
import com.demo.model.Regvo;

public interface RegisterService {
	void insert(Regvo regvo);
	
	void insert(Loginvo loginvo);
	
	List<Regvo> search();
	
	List<Regvo> getById(int id);

	
}