package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.StateDAO;
import com.xworkz.waterfalls.dao.StateDAOImpl;
import com.xworkz.waterfalls.entity.StateEntity;

public class CreateStatesTester {

	public static void main(String[] args) {

		StateEntity Stateentity = new StateEntity("Karnataka", "Kannada", 31, 7);
		
		StateDAO dao = new StateDAOImpl();
		dao.create(Stateentity);
	}

}
