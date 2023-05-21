package com.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.VO.StateVO;


@Repository
public class StateDAO {
	@Autowired
	SessionFactory sessionFactory;

	public void insertState(StateVO stateVO) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(stateVO);
		transaction.commit();
		session.close();
	}
	public List searchState()
	{
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from StateVO");
		List ls = q.list();
		return ls;
	}
	public void deleteState(StateVO stateVO)
	{
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(stateVO);
		transaction.commit();
		session.close();		
	}
	public List editState(StateVO stateVO)
	{
		Session session = sessionFactory.openSession();
		Query q=session.createQuery("from StateVO where id ="+stateVO.getId());
		List ls = q.list();
		return ls;
	}

}
