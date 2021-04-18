package com.xworkz.icecream;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepository;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class ListOfIceCreamTester {

	public static void main(String[] args) {

		IceCreamEntity entity2 = new IceCreamEntity("Blue Moon ", Flavour.CHACOLATE, "Baskin Robbins", 415, Color.BLUE);
		IceCreamEntity entity3 = new IceCreamEntity("Rocky Road", Flavour.CHACOLATE, "Cookie", 200, Color.BROWN);
		IceCreamEntity entity4 = new IceCreamEntity("Grape-Nut", Flavour.PISTA, "Baskin", 315, Color.WHITE);
		IceCreamEntity entity5 = new IceCreamEntity("Vanilla", Flavour.VENILA, "Robbins", 100, Color.WHITE);

		List<IceCreamEntity> list = new ArrayList<IceCreamEntity>();

		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		
		IceCreamRepository repository = new IceCreamRepositoryImpl();
		repository.persist(list);
	}

}
