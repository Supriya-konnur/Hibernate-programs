package com.xworkz.icecream.repository;

import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;

public interface IceCreamRepository {

	public IceCreamEntity persist(IceCreamEntity iceCreamEntity);

	public List<IceCreamEntity> getAll();

	public void updatePriceByName(String name, double price);

	public IceCreamEntity findByNameAndPrice(String name, double price);

	public IceCreamEntity getByMaxPrice();

	public IceCreamEntity getByMinPrice();

	public Double getBySumPrice();

	public Double getPriceByName(String name);

	public List<Object[]> getNameAndFlavourByPrice(double price);
	
	public void persist(List<IceCreamEntity> entities);
	
	public void deleteByName(String name);
	
}
