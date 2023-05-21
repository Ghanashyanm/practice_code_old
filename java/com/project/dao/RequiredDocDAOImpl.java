package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.RequiredDocVO;

@Repository
public class RequiredDocDAOImpl implements RequiredDocDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void insertRequiredDoc(RequiredDocVO requiredDocVO) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(requiredDocVO);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RequiredDocVO> searchRequiredDoc() {
		// TODO Auto-generated method stub
		List<RequiredDocVO> searchList = new ArrayList<RequiredDocVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RequiredDocVO where status = true");
			searchList = (List<RequiredDocVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RequiredDocVO> getByIdRequiredDoc(int id) {
		// TODO Auto-generated method stub
		List<RequiredDocVO> registerList = new ArrayList<RequiredDocVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RequiredDocVO where status = true and id = " + id);
			registerList = (List<RequiredDocVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}
}
