package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.SearchWaterFallDAO;
import com.xworkz.waterfalls.dao.SearchWaterfallDAOImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class HqlTester {

	public static void main(String[] args) {
		SearchWaterFallDAO dao = new SearchWaterfallDAOImpl();
		// findByLocaationAndName
		System.out.println("findByLocaationAndName");
		WaterFallsEntity entity = dao.findByLocaationAndName("gokak", "gokak falls");
		System.out.println(entity);

		// findLocationByName:

		System.out.println("findLocationByName");
		String location = dao.findLocationByName("jog falls");
		System.out.println(location);

		// findNoOfDeathsByLocationAndName
		System.out.println("findNoOfDeathsByLocationAndName");

		Integer death = dao.findNoOfDeathsByLocationAndName("gokak", "gokak falls");
		System.out.println(death);

		// findNoOfDeathsAndDestinationByLocationAndName
		System.out.println("findNoOfDeathsAndDestinationByLocationAndName");
		Object[] entity2 = dao.findNoOfDeathsAndDestinationByLocationAndName("gokak", "gokak falls");
		System.out.println(entity2[0]);
		System.out.println(entity2[1]);

	}

}
