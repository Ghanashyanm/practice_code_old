package com.demo.service;

import java.util.List;

import com.demo.model.Countryvo;
import com.demo.model.Statevo;

public interface RegisterService {
	void insertCountry(Countryvo countryvo);
	List<Countryvo> searchCountry();
	List<Countryvo> getByIdCountry(int id);
	
	void insertState(Statevo statevo);
	List<Statevo> searchState();
	List<Statevo> getByIdState(int id);
}
