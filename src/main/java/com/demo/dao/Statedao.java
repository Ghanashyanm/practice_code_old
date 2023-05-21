package com.demo.dao;

import java.util.List;

import com.demo.model.Statevo;

public interface Statedao {
	void insertState(Statevo statevo);
	List<Statevo> searchState();
	List<Statevo> getByIdState(int id);
}
