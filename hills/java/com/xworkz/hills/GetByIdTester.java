package com.xworkz.hills;

import com.xworkz.hills.dao.HillDAOImlp;
import com.xworkz.hills.dao.HillsDAO;
import com.xworkz.hills.entity.HillsEntity;

public class GetByIdTester {

	public static void main(String[] args) {

		HillsDAO dao =new HillDAOImlp();
		
		HillsEntity entity = dao.getById(1);
		
		if(entity!=null) {
			System.out.println(entity.getName());
			System.out.println(entity);
		}
	}

}
