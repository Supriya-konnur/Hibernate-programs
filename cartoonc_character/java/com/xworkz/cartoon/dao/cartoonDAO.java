package com.xworkz.cartoon.dao;

import java.util.List;

import com.xworkz.cartoon.entity.CartoonEntity;

public interface cartoonDAO {

	public void create(CartoonEntity cartoonEntity);

	public void create(List<CartoonEntity> cartoonEntities);
	
	public CartoonEntity findByName(String name);

//	public CartoonEntity getById(int id);
//
//	public CartoonEntity updateNameById(String name, int id);
//
//	public CartoonEntity deleteById(int id);

}
