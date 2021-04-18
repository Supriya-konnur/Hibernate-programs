package com.xworkz.hills;

import com.xworkz.hills.dao.HillDAOImlp;
import com.xworkz.hills.entity.HillsEntity;

public class UpdateTester {

	public static void main(String[] args) {

		HillsEntity entity = new HillDAOImlp().updateHeightById(7000, 1);
		System.out.println(entity);
	}

}
