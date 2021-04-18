package com.xworkz.waterfalls.dao;

import com.xworkz.waterfalls.entity.WaterFallsEntity;

public interface SearchWaterFallDAO extends WaterFallsDAO {

	public WaterFallsEntity findByLocaationAndName(String loc, String name);

	public String findLocationByName(String name);

	public int findNoOfDeathsByLocationAndName(String loc, String name);

	public Object[] findNoOfDeathsAndDestinationByLocationAndName(String loc, String name);

}
