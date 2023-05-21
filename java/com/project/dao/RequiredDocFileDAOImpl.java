package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.RequiredDocDetailsVO;
import com.project.model.RequiredDocVO;

@Repository
public class RequiredDocFileDAOImpl implements RequiredDocFileDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void insertRequiredDocFile(RequiredDocDetailsVO requiredDocFileVO) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(requiredDocFileVO);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RequiredDocDetailsVO> searchRequiredDocFile() {
		// TODO Auto-generated method stub
		List<RequiredDocDetailsVO> searchList = new ArrayList<RequiredDocDetailsVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RequiredDocDetailsVO where status = true");
			searchList = (List<RequiredDocDetailsVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<RequiredDocDetailsVO> getByIdRequiredDocFile(int id) {
		// TODO Auto-generated method stub
		List<RequiredDocDetailsVO> registerList = new ArrayList<RequiredDocDetailsVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from RequiredDocDetailsVO where status = true and requiredDocVO = " + id);
			registerList = (List<RequiredDocDetailsVO>) query.list();
			System.out.println(registerList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

}
