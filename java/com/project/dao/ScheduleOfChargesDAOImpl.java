package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.model.ScheduleOfChargesVO;

@Repository
public class ScheduleOfChargesDAOImpl implements ScheduleOfChargesDAO{

	@Autowired 
	private SessionFactory sessionFactory;

	@Override
	public void insertScheduleOfCharges(ScheduleOfChargesVO scheduleOfChargesVO) {
		// TODO Auto-generated method stub
		try{
			Session session = sessionFactory.getCurrentSession();
			session.saveOrUpdate(scheduleOfChargesVO);
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScheduleOfChargesVO> searchScheduleOfCharges() {
		// TODO Auto-generated method stub
		List<ScheduleOfChargesVO> searchList = new ArrayList<ScheduleOfChargesVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from ScheduleOfChargesVO where status = true");
			searchList = (List<ScheduleOfChargesVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ScheduleOfChargesVO> getByIdScheduleOfCharges(int id) {
		// TODO Auto-generated method stub
		List<ScheduleOfChargesVO> registerList = new ArrayList<ScheduleOfChargesVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from ScheduleOfChargesVO where status = true and id = " + id);
			registerList = (List<ScheduleOfChargesVO>) query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerList;
	}

}
