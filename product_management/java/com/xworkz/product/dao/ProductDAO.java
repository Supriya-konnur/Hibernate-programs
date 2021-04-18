package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public interface ProductDAO {

	public void persist(ProductEntity productEntity);

	public ProductEntity findByNameAndManufacturer(String name, String manu);

	public ProductEntity findByTypeAndBrandAndName(String name, String brand, ProductType type);

	public Double findPriceByTypeAndBrandAndName(String name, String brand, ProductType type);

	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type);

	public ProductEntity findByTypeAndBrandAndQuality(String name, String brand, boolean quality);

	public Object[] findnameAndTypeById(int id);

	public int findMaxId();

	public long findSize();

	public Double findMaxPrice();

	public Double findSumOfPrice();

	public Integer findMinId();

	public List<Object> findDistinct();

	public void updateBrandByName(String brand,String name);

	public List<ProductEntity> findAll();

	public List<ProductEntity> findAllIds();

}
