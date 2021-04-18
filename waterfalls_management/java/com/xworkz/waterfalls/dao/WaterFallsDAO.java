package com.xworkz.waterfalls.dao;

import com.xworkz.waterfalls.entity.WaterFallsEntity;

public interface WaterFallsDAO {
	public void create(WaterFallsEntity waterfallsEntity);

	public WaterFallsEntity getById(int id);

	public WaterFallsEntity updateHeightAndDepthById(int id, int height, int depth);

	public void deleteById(int id);

}
