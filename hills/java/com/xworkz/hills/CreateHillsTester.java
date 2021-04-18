package com.xworkz.hills;

import com.xworkz.hills.dao.HillDAOImlp;
import com.xworkz.hills.dao.HillsDAO;
import com.xworkz.hills.entity.HillsEntity;

public class CreateHillsTester {

	public static void main(String[] args) {

		HillsEntity entity = new HillsEntity("NiligiriHills", "TamilNadu", 6000, 4);
		
		HillsDAO dao=new HillDAOImlp();
		dao.create(entity);
		
		
	}

}
