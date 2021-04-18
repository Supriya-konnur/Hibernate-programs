package com.xworkz.hills;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hills.dao.HillDAOImlp;
import com.xworkz.hills.dao.HillsDAO;
import com.xworkz.hills.entity.HillsEntity;

public class CreateListHillsTester {

	public static void main(String[] args) {

		HillsEntity entity1 = new HillsEntity("Anamalai Hills", "Kerala", 8842, 4);
		HillsEntity entity2 = new HillsEntity("Ashumbu Hills", "Tamil Nadu", 6129, 4);
		HillsEntity entity3 = new HillsEntity("Cardamom Hills", "Kerala", 8842, 4);
		HillsEntity entity4 = new HillsEntity("Nilgiri Hills", "Karnataka,Tamil Nadu,Kerala", 8652, 5);
		HillsEntity entity5 = new HillsEntity("Nallamala Hills", "Andra Pradesh", 8842, 4);
		
		List<HillsEntity> list = new ArrayList<HillsEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		
		HillsDAO dao = new HillDAOImlp();
		dao.create(list);

	}

}
