package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Countrydao;
import com.demo.dao.Statedao;
import com.demo.model.Countryvo;
import com.demo.model.Statevo;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private Countrydao countrydao;
	
	@Autowired
	private Statedao statedao;

	
	@Override
	public void insertCountry(Countryvo countryvo) {
		// TODO Auto-generated method stub
		this.countrydao.insertCountry(countryvo);
		
	}

	@Override
	public List<Countryvo> searchCountry() {
		// TODO Auto-generated method stub
		return this.countrydao.searchCountry();
	}
	@Override
	public List<Countryvo> getByIdCountry(int id) {
		// TODO Auto-generated method stub
		return this.countrydao.getByIdCounrty(id);
	}
	@Override
	public void insertState(Statevo statevo) {
		// TODO Auto-generated method stub
		this.statedao.insertState(statevo);
	}
	@Override
	public List<Statevo> searchState() {
		// TODO Auto-generated method stub
		return this.statedao.searchState();
	}
	@Override
	public List<Statevo> getByIdState(int id) {
		// TODO Auto-generated method stub
		return this.statedao.getByIdState(id);
	}
	
	
	
}
