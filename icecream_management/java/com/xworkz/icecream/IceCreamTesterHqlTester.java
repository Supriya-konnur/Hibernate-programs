package com.xworkz.icecream;

import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class IceCreamTesterHqlTester {

	public static void main(String[] args) {

		//getAll
		System.out.println("getAll");
		List<IceCreamEntity> list= new IceCreamRepositoryImpl().getAll();
		System.out.println(list);
		System.out.println();
		
		//update
		System.out.println("updatePriceAndName");
		new IceCreamRepositoryImpl().updatePriceByName("Titanic", 250);
		System.out.println();
		
		//findByNameAndPrice
		System.out.println("findByNameAndPrice");
		IceCreamEntity entity =new IceCreamRepositoryImpl().findByNameAndPrice("Titanic", 250);
		System.out.println(entity);
		System.out.println();
		
		//getByMaxPrice
		System.out.println("getByMaxPrice");
		IceCreamEntity entity1 =new IceCreamRepositoryImpl().getByMaxPrice();
		System.out.println(entity1);
		System.out.println();
		
		//getMinPrice
		System.out.println("getMinPrice");
		IceCreamEntity entity2 =new IceCreamRepositoryImpl().getByMinPrice();
		System.out.println(entity2);
		System.out.println();
		
		//getBySumPrice
		System.out.println("getBySumPrice");
		Double entity3 =new IceCreamRepositoryImpl().getBySumPrice();
		System.out.println(entity3);
		System.out.println();
		
		//getPriceByName
		System.out.println("getPriceByName");
		Double entity4 =new IceCreamRepositoryImpl().getPriceByName("Rocky Road");
		System.out.println(entity4);
		System.out.println();
	
		//getNameAndFlavourByPrice
		System.out.println("getNameAndFlavourByPrice");
		List<Object[]> entity5 =new IceCreamRepositoryImpl().getNameAndFlavourByPrice(415);
		System.out.println("Name:");
		entity5.forEach(e->System.out.println(e[0]));
		System.out.println("Flavour:");
		entity5.forEach(e->System.out.println(e[1]));
		
		System.out.println();
		
		
	}

}
