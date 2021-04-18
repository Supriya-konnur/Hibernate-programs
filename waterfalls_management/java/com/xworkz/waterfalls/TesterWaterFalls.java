package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.WaterFallsDAO;
import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class TesterWaterFalls {

	public static void main(String[] args) {

		WaterFallsEntity entity = new WaterFallsEntity();
		entity.setName("Kunchikal falls");
		entity.setWidth(1000);
		entity.setLocatioon("shivmoga");
		entity.setHeight(2000);
		entity.setDepth(1000);
		entity.setElectricityGenerator("2unitX 500MW");
		entity.setSourceRiver("ThungaBdhra");
		entity.setEntryFees(100);
		entity.setDestination("occean");
		entity.setRating(5);
		entity.setNoOfDeath(0);
		entity.setNoOfVisitor(500);
		
		WaterFallsDAO dao = new WaterFallsDAOImpl();
		 dao.create(entity);
	
	
		 WaterFallsEntity entity1 = new WaterFallsEntity();
			entity1.setName("Jog falls");
			entity1.setWidth(1000);
			entity1.setLocatioon("shivmoga");
			entity1.setHeight(2000);
			entity1.setDepth(1000);
			entity1.setElectricityGenerator("2unitX 500MW");
			entity1.setSourceRiver("ThungaBdhra");
			entity1.setEntryFees(100);
			entity1.setDestination("occean");
			entity1.setRating(5);
			entity1.setNoOfDeath(1);
			entity1.setNoOfVisitor(500);
			
			WaterFallsDAO dao1 = new WaterFallsDAOImpl();
			 dao1.create(entity1);
	
	
			 WaterFallsEntity entity2 = new WaterFallsEntity();
				entity2.setName("Abbe falls");
				entity2.setWidth(1000);
				entity2.setLocatioon("SakaleShpur");
				entity2.setHeight(2004);
				entity2.setDepth(1003);
				entity2.setElectricityGenerator("2unitX 500MW");
				entity2.setSourceRiver("Thunga");
				entity2.setEntryFees(100);
				entity2.setDestination("indanoccean");
				entity2.setRating(5);
				entity2.setNoOfDeath(2);
				entity2.setNoOfVisitor(500);
				
				WaterFallsDAO dao2 = new WaterFallsDAOImpl();
				 dao2.create(entity2);
	}
	

}
