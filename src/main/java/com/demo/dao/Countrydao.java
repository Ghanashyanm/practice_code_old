package com.demo.dao;

import java.util.List;

import com.demo.model.Countryvo;

public interface Countrydao {
	void insertCountry(Countryvo countryvo);
	List<Countryvo> searchCountry();
	List<Countryvo> getByIdCounrty(int id);
}
