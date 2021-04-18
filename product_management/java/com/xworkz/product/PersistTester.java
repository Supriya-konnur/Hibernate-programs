package com.xworkz.product;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class PersistTester {

	public static void main(String[] args) {

		ProductEntity entity = new ProductEntity();
		entity.setName("Mobile");
		entity.setType(ProductType.ELECTRONIC);
		entity.setPrice(10000);
		entity.setQuantity(2);
		entity.setQuality(true);
		entity.setManufacturer("Pete Lau");
		entity.setBrand("OnePlus");
		
		ProductDAO dao = new  ProductDAOImpl();
		dao.persist(entity);
	}

}
