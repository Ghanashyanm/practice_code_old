package DAO;


import java.util.*;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.formVO;

public class formDAO {
	public void insert(formVO v) {
			
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(v);
			
		t.commit();
		s.close();
		
	}
	public List search() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        Session s = sessionFactory.openSession();
       
        Query q=s.createQuery("from formVO");
       
        List ls=q.list();
        
        return ls;
		
		
	}
	public void delete(formVO v){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.delete(v);
		
		t.commit();
		s.close();
		
	}
	public List edit(formVO v){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from formVO where id='"+v.getId()+"'");
		
		List ls = q.list();
		
		return ls;
	}
	public void update(formVO v) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.update(v);
			
		t.commit();
		s.close();
		
	}
}
