package com.xworkz.hills.dao;

import java.util.List;

import com.xworkz.hills.entity.HillsEntity;

public interface HillsDAO {

	public void create(HillsEntity entity);

	public void create(List<HillsEntity> entries);

	public HillsEntity getById(int id);

	public HillsEntity updateHeightById(int height, int id);

	public void deleteById(int id);

}
