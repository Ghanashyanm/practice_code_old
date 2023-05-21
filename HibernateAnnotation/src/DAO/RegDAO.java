package DAO;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import VO.RegVO;

public class RegDAO {
	public void insertReg(RegVO regVO) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(regVO);

		t.commit();
		s.close();
	}
	public List searchReg() {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q =  s.createQuery("from RegVO");
		List ls = q.list();
		return ls;
	}
	public void deleteReg(RegVO regVO) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.delete(regVO);
		
		t.commit();
		s.close();
	}
	
	public List editReg(RegVO regVO) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q =  s.createQuery("from RegVO where id='"+regVO.getRegId()+"'");
		List ls = q.list();
		return ls;
	}
	public void updateReg(RegVO regVO) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.update(regVO);
		
		t.commit();
		s.close();
	}

}
