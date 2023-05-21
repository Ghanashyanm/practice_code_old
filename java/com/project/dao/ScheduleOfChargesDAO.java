package com.project.dao;

import java.util.List;

import com.project.model.ScheduleOfChargesVO;

public interface ScheduleOfChargesDAO {
	
	void insertScheduleOfCharges(ScheduleOfChargesVO scheduleOfChargesVO);
	
	List<ScheduleOfChargesVO> searchScheduleOfCharges();
	
	List<ScheduleOfChargesVO> getByIdScheduleOfCharges(int id);
	
}
