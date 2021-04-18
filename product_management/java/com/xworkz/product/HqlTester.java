package com.xworkz.product;

import java.util.List;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class HqlTester {

	public static void main(String[] args) {

		ProductDAO dao = new ProductDAOImpl();
		// findByNameAndManufacturer
		System.out.println("findByNameAndManufacturer");
		ProductEntity entity = dao.findByNameAndManufacturer("Mobile", "Pete Lau");
		System.out.println(entity);

		System.out.println();

		// findByTypeAndBrandAndName
		System.out.println("findByTypeAndBrandAndName");
		ProductEntity entity2 = dao.findByTypeAndBrandAndName("Mobile", "OnePlus", ProductType.ELECTRONIC);
		System.out.println(entity2);
		System.out.println();

		// findPriceByTypeAndBrandAndName
		System.out.println("findPriceByTypeAndBrandAndName");
		Double double1 = dao.findPriceByTypeAndBrandAndName("Mobile", "OnePlus", ProductType.ELECTRONIC);
		System.out.println(double1);
		System.out.println();

		// findPriceAndQuantityByTypeAndBrandAndName
		System.out.println("findPriceAndQuantityByTypeAndBrandAndName");
		Object[] objects = dao.findPriceAndQuantityByTypeAndBrandAndName("Mobile", "OnePlus", ProductType.ELECTRONIC);
		System.out.println(objects[0]);
		System.out.println(objects[1]);
		System.out.println();

		// findByTypeAndBrandAndQuality
		System.out.println("findByTypeAndBrandAndQuality");
		ProductEntity entity3 = dao.findByTypeAndBrandAndQuality("Mobile", "OnePlus", true);
		System.out.println(entity3);
		System.out.println();

		// findnameAndTypeById
		System.out.println("findnameAndTypeById");
		Object[] object = dao.findnameAndTypeById(3);
		System.out.println(object[0]);
		System.out.println(object[1]);
		System.out.println();

		// findMaxId
		System.out.println("findMaxId");
		Integer integer = dao.findMaxId();
		System.out.println(integer);
		System.out.println();

		// findSize
		System.out.println("findSize");
		Long long1 = dao.findSize();
		System.out.println(long1);
		System.out.println();

		// findMaxPrice
		System.out.println("findMaxPrice");
		Double double3 = dao.findMaxPrice();
		System.out.println(double3);
		System.out.println();

		// findSumOfPrice
		System.out.println("findSumOfPrice");
		Double double4 = dao.findSumOfPrice();
		System.out.println(double4);
		System.out.println();

		// findMinId
		System.out.println("findMinId");
		Integer integer3 = dao.findMinId();
		System.out.println(integer3);
		System.out.println();

		// findDistinct
		System.out.println("findDistinct");
		List<Object> entity4 = dao.findDistinct();
		for (Object object2 : entity4) {
			System.out.println(object2);
		
		}
	
	}

}
