package com.xworkz.icecream;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.icecream.entity.IceCreamEntity;
import com.xworkz.icecream.entity.IceCreamEntity.Color;
import com.xworkz.icecream.entity.IceCreamEntity.Flavour;
import com.xworkz.icecream.repository.IceCreamRepository;
import com.xworkz.icecream.repository.IceCreamRepositoryImpl;

public class PersistTester {

	public static void main(String[] args) {

		IceCreamEntity entity1 = new IceCreamEntity("Titanic", Flavour.CHACOLATE, "Baskin Robbins", 215, Color.BROWN);
		
		
		IceCreamRepository  repository = new IceCreamRepositoryImpl();
		repository.persist(entity1);
	}

}
