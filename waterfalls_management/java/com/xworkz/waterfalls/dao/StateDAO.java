package com.xworkz.waterfalls.dao;

import java.util.List;

import com.xworkz.waterfalls.entity.StateEntity;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public interface StateDAO {

	public void create(StateEntity entity);

	public void create(List<StateEntity> entities);

	public void create(WaterFallsEntity wentity, StateEntity sentity1);
}
