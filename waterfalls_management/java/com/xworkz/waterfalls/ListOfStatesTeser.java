package com.xworkz.waterfalls;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.waterfalls.dao.StateDAO;
import com.xworkz.waterfalls.dao.StateDAOImpl;
import com.xworkz.waterfalls.entity.StateEntity;

public class ListOfStatesTeser {

	public static void main(String[] args) {

		StateEntity entity1 = new StateEntity("Karnataka", "Kannada", 31, 7);
		StateEntity entit2 = new StateEntity("Andra", "Telugu", 13, 6);
		StateEntity entity3 = new StateEntity("Kerala", "Malayalam ", 14, 6);
		StateEntity entity4 = new StateEntity("Maharashtra", "Marathi", 36, 9);
		StateEntity entity5 = new StateEntity("Gujarat", "Gujarathi", 36, 8);
		
		List<StateEntity> list = new ArrayList<StateEntity>();
		list.add(entity1);
		list.add(entit2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		
		StateDAO dao =new StateDAOImpl();
		dao.create(list);

		
	}

}
