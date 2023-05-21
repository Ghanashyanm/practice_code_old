package com.demo.dao;


import java.util.List;

import com.demo.model.Regvo;

public interface Regdao {

	void insert(Regvo regvo);
	
	List<Regvo> search();
	
	List<Regvo> getById(int id);
	
}
