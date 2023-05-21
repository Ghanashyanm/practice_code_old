package com.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Logindao;
import com.demo.dao.Regdao;
import com.demo.model.Loginvo;
import com.demo.model.Regvo;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private Regdao regdao;
	
	@Autowired
	private Logindao logindao;
	
	@Override
	public void insert(Regvo regvo)
	{
		this.regdao.insert(regvo);
	}
	
	@Override
	public void insert(Loginvo loginvo)
	{
		this.logindao.insert(loginvo);
	}
	
	@Override
	public List<Regvo> search()
	{
		return this.regdao.search();
	}
	
	@Override
	public List<Regvo> getById(int id)
	{
		return this.regdao.getById(id);
	}
	
}
