package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ScheduleOfChargesDAO;
import com.project.model.ScheduleOfChargesVO;

@Service
@Transactional
public class ScheduleOfChargesServiceImpl implements ScheduleOfChargesService{
	
	@Autowired
	private ScheduleOfChargesDAO scheduleOfChargesDAO;
	
	@Override
	public void insertScheduleOfCharges(ScheduleOfChargesVO scheduleOfChargesVO) {
		// TODO Auto-generated method stub
		this.scheduleOfChargesDAO.insertScheduleOfCharges(scheduleOfChargesVO);
		
	}

	@Override
	public List<ScheduleOfChargesVO> searchScheduleOfCharges() {
		// TODO Auto-generated method stub
		return this.scheduleOfChargesDAO.searchScheduleOfCharges();
	}

	@Override
	public List<ScheduleOfChargesVO> getByIdScheduleOfCharges(int id) {
		// TODO Auto-generated method stub
		return this.scheduleOfChargesDAO.getByIdScheduleOfCharges(id);
	}

}
