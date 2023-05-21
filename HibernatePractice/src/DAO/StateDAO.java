package DAO;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.StateVO;

public class StateDAO {
	public void insertState(StateVO stateVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(stateVO);
		
		t.commit();
		s.close();
	}

	public List searchState(){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from StateVO");
		List ls = q.list();
		return ls;
	}
	public void deleteState(StateVO stateVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.delete(stateVO);
		
		t.commit();
		s.close();
	}
	public List editState(StateVO stateVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from StateVO where id = '"+stateVO.getId()+"'");
		List ls = q.list();
		return ls;
	}
	public void updateState(StateVO stateVO){
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.update(stateVO);
		
		t.commit();
		s.close();
	}
}
