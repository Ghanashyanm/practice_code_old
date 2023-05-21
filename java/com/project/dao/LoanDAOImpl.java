package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanVO;

@Repository
public class LoanDAOImpl implements LoanDAO{
	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void insertLoan(LoanVO loanVO)
	{
		try{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(loanVO);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanVO> searchLoan() {
		List<LoanVO> searchList = new ArrayList<LoanVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from LoanVO where status = true");
			searchList = (List<LoanVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanVO> getByIdLoan(int id) {
		List<LoanVO> registerList = new ArrayList<LoanVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from LoanVO where status = true and id = " + id);
			registerList = (List<LoanVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}
}
