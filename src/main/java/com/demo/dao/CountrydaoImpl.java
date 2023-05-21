package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Countryvo;

@Repository
public class CountrydaoImpl implements Countrydao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertCountry(Countryvo countryvo)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(countryvo);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Countryvo> searchCountry()
	{
		List<Countryvo> ls=new ArrayList<Countryvo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Countryvo  where status=true");
		 ls = (List<Countryvo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
	
	@SuppressWarnings("unchecked")
	public List<Countryvo> getByIdCounrty(int id)
	{
		List<Countryvo> ls=new ArrayList<Countryvo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Countryvo where status=true and id="+id);
		 ls = (List<Countryvo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
	
}
