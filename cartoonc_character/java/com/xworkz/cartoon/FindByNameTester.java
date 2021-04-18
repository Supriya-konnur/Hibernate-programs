package com.xworkz.cartoon;

import com.xworkz.cartoon.dao.cartoonDAO;
import com.xworkz.cartoon.dao.cartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;

public class FindByNameTester {

	public static void main(String[] args) {

		cartoonDAO dao = new cartoonDAOImpl();
		CartoonEntity entity =dao.findByName("Tom");
		System.out.println(entity);
	}

}
