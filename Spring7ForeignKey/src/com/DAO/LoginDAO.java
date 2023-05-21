package com.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.LoginVO;

@Repository
public class LoginDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertOrUpdate(LoginVO loginVO){
		
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.saveOrUpdate(loginVO);
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void delete(LoginVO loginVO){
		
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.delete(loginVO);
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
