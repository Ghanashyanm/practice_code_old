package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.DocumentVO;


@Repository
public class DocumentDAOImpl implements DocumentDAO{
	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void insertDocument(DocumentVO documentVO)
	{
		try{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(documentVO);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentVO> searchDocument() {
		List<DocumentVO> registerList = new ArrayList<DocumentVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from DocumentVO where status = true");
			registerList = (List<DocumentVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DocumentVO> getByIdDocument(int id) {
		List<DocumentVO> registerList = new ArrayList<DocumentVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from DocumentVO where status = true and id = " + id);
			registerList = (List<DocumentVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}
}
