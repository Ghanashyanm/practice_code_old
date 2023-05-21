package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.RegVO;

@Repository
public class RegDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertOrUpdate(RegVO registerVO){
		
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.saveOrUpdate(registerVO);
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void delete(RegVO registerVO){
		
		try {
			
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			
			session.delete(registerVO);
			
			transaction.commit();
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public List<RegVO> edit(RegVO registerVO){
		
		List<RegVO> editlist = null;
		try {
			
			Session session = sessionFactory.openSession();
			
			Query query = session.createQuery("from RegVO where id ="+registerVO.getId());
			
			editlist = query.list();
			
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return editlist;
	}
	
	public List<RegVO> display(){
		
		List<RegVO> displaylist = null;
		try {
			
			Session session = sessionFactory.openSession();
			
			Query query = session.createQuery("from RegVO");
			
			displaylist = query.list();
			
			session.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return displaylist;
	}
}
