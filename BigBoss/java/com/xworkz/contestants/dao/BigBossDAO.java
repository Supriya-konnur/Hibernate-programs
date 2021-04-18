package com.xworkz.contestants.dao;

import com.xworkz.contestants.entity.ContestantEntity;

public interface BigBossDAO {

	void create(ContestantEntity contestantEntity);
	
	public ContestantEntity getById(int id);
	
	public ContestantEntity updateNoOfTasksAndDaysIn(int id, int noOfTask, int daysIn);
	
	public void deleteById(int id);
}
