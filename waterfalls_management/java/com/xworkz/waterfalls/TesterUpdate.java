package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class TesterUpdate {

	public static void main(String[] args) {
		WaterFallsEntity entity=new WaterFallsDAOImpl().updateHeightAndDepthById(1, 3000, 3000);
		System.out.println(entity);
	}

}
