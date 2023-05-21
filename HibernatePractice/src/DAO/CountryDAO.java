package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.CountryVO;

public class CountryDAO {
	public void insertCountry(CountryVO countryVO ){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction  t = s.beginTransaction();
		
		s.save(countryVO);
		
		t.commit();
		s.close();
	}

	public List searchCountry(){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from CountryVO");
		List ls = q.list();
		return ls;
	}
	public void deleteCountry(CountryVO countryVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.delete(countryVO);
		
		t.commit();
		s.close();
		
	}
	public List editCountry(CountryVO countryVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from CountryVO where countryId = '"+countryVO.getCountryId()+"'");
		List ls = q.list();
		return ls;
	}
	public void updateCountry(CountryVO countryVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.update(countryVO);
		
		t.commit();
		s.close();
		
	}

}
