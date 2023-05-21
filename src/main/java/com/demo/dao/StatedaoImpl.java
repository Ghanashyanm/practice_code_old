package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Statevo;

@Repository
public class StatedaoImpl implements Statedao {
	@Autowired
	SessionFactory sessionFactory;

	public void insertState(Statevo statevo) {

		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(statevo);
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Statevo> searchState()
	{
		List<Statevo> ls=new ArrayList<Statevo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Statevo where status = true");
		 ls = (List<Statevo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
	
	@SuppressWarnings("unchecked")
	public List<Statevo> getByIdState(int id)
	{
		List<Statevo> ls=new ArrayList<Statevo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Statevo where status=true and id="+id);
		 ls = (List<Statevo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
}
