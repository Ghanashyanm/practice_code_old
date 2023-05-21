package DAO;


import org.hibernate.cfg.Configuration;

import org.hibernate.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;

import VO.countryVO;


public class countryDAO {

	public void insert(countryVO v) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(v);

		t.commit();
		s.close();

	}
	public List searchCountry() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from countryVO");
		List ls = q.list();
		return ls;
	}
	public void  deleteCountry(countryVO v) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.delete(v);
		t.commit();
		s.close();

	}
	public void deleteState(countryVO v) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.delete(v);
		t.commit();
		s.close();

	}

	public List editCountry(countryVO v){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from countryVO where id='"+v.getCountryId()+"'");
		
		List ls = q.list();
		
		return ls;
	}
	public void upadateCountry(countryVO v){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.update(v);
		t.commit();
		s.close();
	}
}


