package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.WaterFallsDAO;
import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class TesterGetByID {

	public static void main(String[] args) {

		WaterFallsDAO dao = new WaterFallsDAOImpl();
		WaterFallsEntity entity = dao.getById(1);
		if(entity !=null) {
			System.out.println(entity.getName());
			System.out.println(entity);
		}
	}

}
