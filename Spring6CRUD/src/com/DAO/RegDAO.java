package com.DAO;

import java.util.ArrayList;
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
	public void insert(RegVO v){
		try{
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(v);
			transaction.commit();
			session.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public List<RegVO> search()
	{
			Session session = sessionFactory.openSession();
			Query q = session.createQuery("from RegVO");
			List<RegVO> ls = q.list();
			session.close();

			return ls;
		
	}
	public void delete(RegVO v)
	{
		try{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(v);
		transaction.commit();
		session.close();
		}
		catch(Exception s)
		{
			System.out.println(s);
		}
	}
	public List edit(RegVO v)
	{
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from RegVO where id="+v.getId());
		List ls = q.list();
		return ls;
		
	}
}
