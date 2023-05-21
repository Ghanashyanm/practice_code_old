package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.countryVO;
import VO.stateVO;

public class stateDAO {
	public void insert(stateVO v) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.save(v);

		t.commit();
		s.close();
	}

	public List search() {

		List ls = new ArrayList();
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from stateVO");
		List ls1 = q.list();
		return ls1;

	}

	public void deleteState(stateVO v) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.delete(v);
		t.commit();
		s.close();
	}

	public List editState(stateVO v) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from stateVO where id='" + v.getId() + "'");
		List ls = q.list();
		return ls;

	}

	public void updateState(stateVO v) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		s.update(v);
		t.commit();
		s.close();
	}

}
