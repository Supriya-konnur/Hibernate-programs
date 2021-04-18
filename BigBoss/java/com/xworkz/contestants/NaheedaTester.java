package com.xworkz.contestants;

import com.xworkz.contestants.dao.BigBossDAO;
import com.xworkz.contestants.dao.BigBossDAOImpl;
import com.xworkz.contestants.entity.ContestantEntity;

public class NaheedaTester {

	public static void main(String[] args) {
		BigBossDAO dao = new BigBossDAOImpl();

		ContestantEntity entity = dao.getById(2);
		
		System.out.println(entity.getName());
		System.out.println(entity);
		
		
	}

}
