package com.xworkz.contestants;

import com.xworkz.contestants.dao.BigBossDAOImpl;
import com.xworkz.contestants.entity.ContestantEntity;

public class TesterVaralaxmi {

	public static void main(String[] args) {

		ContestantEntity entity = new BigBossDAOImpl().updateNoOfTasksAndDaysIn(2, 2, 2);
		System.out.println(entity);
	}

}
