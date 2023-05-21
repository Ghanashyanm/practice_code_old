package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.LoginVO;

public class LoginDAO {
	
	public void insertLogin(LoginVO loginVO)
	{
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(loginVO);
		
		t.commit();
		s.close();
	}
	public List searchLogin()
	{
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from LoginVO");
		List ls = q.list();
		return ls;
		
	}
	public void deleteLogin(LoginVO loginVO)
	{
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		
		s.delete(loginVO);
		
		t.commit();
		s.close();
		
	}
	public void deleteReg(LoginVO loginVO)
	{
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		
		s.delete(loginVO);
		
		t.commit();
		s.close();
		
	}
	public List editLogin(LoginVO loginVO)
	{
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from LoginVO where loginId = '"+loginVO.getLoginId()+"' ");
		List ls = q.list();
		return ls;
		
	}
	public void updateLogin(LoginVO loginVO)
	{
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t =s.beginTransaction();
		
		s.update(loginVO);
		
		t.commit();
		s.close();
		
	}
}
