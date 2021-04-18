package com.xworkz.icecream;

import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class DeleteTester {

	public static void main(String[] args) {

		
		System.out.println("deleteByName");
		new IceCreamRepositoryImpl().deleteByName("Vanilla");
				
	}

}
