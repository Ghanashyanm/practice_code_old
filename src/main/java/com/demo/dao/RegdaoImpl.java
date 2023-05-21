package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.model.Regvo;

@Repository
public class RegdaoImpl implements Regdao {

	@Autowired
	private SessionFactory sessionFactory;

	public void insert(Regvo regvo)
	{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(regvo);
	}

	@SuppressWarnings("unchecked")
	public List<Regvo> search()
	{
		List<Regvo> ls=new ArrayList<Regvo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Regvo  where status=true");
		 ls = (List<Regvo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Regvo> getById(int id)
	{
		List<Regvo> ls=new ArrayList<Regvo>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from Regvo where status=true and id="+id);
		 ls = (List<Regvo>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}
	
}
