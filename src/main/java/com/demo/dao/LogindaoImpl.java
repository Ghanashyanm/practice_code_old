package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Loginvo;

@Repository
public class LogindaoImpl implements Logindao{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(Loginvo loginvo) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(loginvo);
	}
	
	
	
	
}
