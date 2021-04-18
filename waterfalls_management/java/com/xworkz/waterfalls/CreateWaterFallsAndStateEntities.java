package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.StateDAO;
import com.xworkz.waterfalls.dao.StateDAOImpl;
import com.xworkz.waterfalls.dao.WaterFallsDAO;
import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;
import com.xworkz.waterfalls.entity.StateEntity;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class CreateWaterFallsAndStateEntities {

	public static void main(String[] args) {

		WaterFallsEntity entity = new WaterFallsEntity();
		entity.setName("Gokak falls");
		entity.setWidth(1000);
		entity.setLocatioon("Gokak");
		entity.setHeight(2000);
		entity.setDepth(1000);
		entity.setElectricityGenerator("2unitX 500MW");
		entity.setSourceRiver("Bdhra");
		entity.setEntryFees(100);
		entity.setDestination("Indian Occean");
		entity.setRating(5);
		entity.setNoOfDeath(0);
		entity.setNoOfVisitor(1000);
		
		StateEntity entity2 = new StateEntity("Karnataka", "Kannada", 31, 7);
		
		//WaterFallsDAO dao = new WaterFallsDAOImpl();
		StateDAO dao2 =new StateDAOImpl();
		
		dao2.create(entity, entity2);
		
	}

}
