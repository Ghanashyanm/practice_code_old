package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.demo.dao.RegisterDAO;
import com.demo.model.RegisterVO;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(RegisterVO registerVO) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(registerVO);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RegisterVO> search()
	{
		List<RegisterVO> ls=new ArrayList<RegisterVO>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q =  session.createQuery("from RegisterVO where status=true");
		 ls = (List<RegisterVO>)q.list();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ls;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RegisterVO> getById(int id)
	{
		List<RegisterVO> ls=new ArrayList<RegisterVO>();
		try{
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from RegisterVO where status=true and id="+id);
		 ls = (List<RegisterVO>)q.list();
		
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return ls;
	}
}
