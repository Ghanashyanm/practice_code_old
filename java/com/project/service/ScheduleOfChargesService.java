package com.project.service;

import java.util.List;

import com.project.model.ScheduleOfChargesVO;

public interface ScheduleOfChargesService {
	void insertScheduleOfCharges(ScheduleOfChargesVO scheduleOfChargesVO);
	
	List<ScheduleOfChargesVO> searchScheduleOfCharges();
	
	List<ScheduleOfChargesVO> getByIdScheduleOfCharges(int id);
}
