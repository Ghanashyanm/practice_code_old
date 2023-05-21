package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.LoanTypeVO;

@Repository
public class LoanTypeDAOImpl implements LoanTypeDAO {
	@Autowired 
	private SessionFactory sessionFactory;
	
	@Override
	public void insertLoanType(LoanTypeVO loanTypeVO)
	{
		try{
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(loanTypeVO);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanTypeVO> searchLoanType() {
		List<LoanTypeVO> searchList = new ArrayList<LoanTypeVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from LoanTypeVO where status = true");
			searchList = (List<LoanTypeVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanTypeVO> getByIdLoanType(int id) {
		List<LoanTypeVO> registerList = new ArrayList<LoanTypeVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from LoanTypeVO where status = true and id = " + id);
			registerList = (List<LoanTypeVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}
}
