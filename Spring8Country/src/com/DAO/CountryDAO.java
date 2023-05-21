package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.CountryVO;

@Repository
public class CountryDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insertCountry(CountryVO countryVO)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(countryVO);
		transaction.commit();
		session.close();
	}
	
	public List searchCountry()
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q=session.createQuery("from CountryVO");
		System.out.println("Query::"+q);
		List ls = q.list();
		
		return ls;
	}
	
	public void deleteCountry(CountryVO countryVO)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(countryVO);
		transaction.commit();
		session.close();		
	}
	
	public List editCountry(CountryVO countryVO)
	{
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from CountryVO where id ="+countryVO.getId());
		List ls = q.list();
		return ls;
	}
	
}
