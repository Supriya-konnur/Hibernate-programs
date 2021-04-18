package com.xworkz.contestants;

import com.xworkz.contestants.dao.BigBossDAO;
import com.xworkz.contestants.dao.BigBossDAOImpl;
import com.xworkz.contestants.entity.ContestantEntity;

public class TesterSupriya {

	public static void main(String[] args) {

		ContestantEntity entity =new ContestantEntity();
		
		//entity.setId(1);
		entity.setName("Naheeda");
		entity.setGender("Female");
		entity.setContestantType("Dancer");
		entity.setNoOfTasks(1);
		entity.setDaysIn(1);
		entity.setSeasonNo(8);
		
		BigBossDAO bossDAO = new BigBossDAOImpl();
		
		bossDAO.create(entity);
		bossDAO.create(entity);

		
		entity.setName("Suhel");
		entity.setGender("Male");
		entity.setContestantType("JavaDeveloper");
		entity.setNoOfTasks(1);
		entity.setDaysIn(1);
		
		entity.setSeasonNo(8);
		
		BigBossDAO bossDAO1 = new BigBossDAOImpl();
		
		bossDAO1.create(entity);
		bossDAO1.create(entity);
		bossDAO1.create(entity);
		
			
		
	}

}
