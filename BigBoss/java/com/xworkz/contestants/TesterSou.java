package com.xworkz.contestants;

import com.xworkz.contestants.dao.BigBossDAOImpl;


public class TesterSou {

	public static void main(String[] args) {

		new BigBossDAOImpl().deleteById(7);
		new BigBossDAOImpl().deleteById(4);


	}

}
