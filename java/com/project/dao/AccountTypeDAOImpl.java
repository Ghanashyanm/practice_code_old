package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.AccountTypeVO;

@Repository
public class AccountTypeDAOImpl implements AccountTypeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insertAccoutType(AccountTypeVO accountTypeVO) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(accountTypeVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountTypeVO> searchAccountType() {
		List<AccountTypeVO> registerList = new ArrayList<AccountTypeVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from AccountTypeVO where status = true");
			registerList = (List<AccountTypeVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountTypeVO> getByIdAccountType(int id) {
		List<AccountTypeVO> registerList = new ArrayList<AccountTypeVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from AccountTypeVO where status = true and id = " + id);
			registerList = (List<AccountTypeVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

}
