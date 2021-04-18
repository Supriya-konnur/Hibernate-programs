package com.xworkz.product;

import java.util.List;

import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class FindAllTester {

	public static void main(String[] args) {
		List<ProductEntity> entities=new ProductDAOImpl().findAll();
		System.out.println(entities);
		
		List<ProductEntity> entitie=new ProductDAOImpl().findAllIds();
		System.out.println(entitie);
		
		
		new ProductDAOImpl().updateBrandByName("Dell", "Laptop");
	}

}
