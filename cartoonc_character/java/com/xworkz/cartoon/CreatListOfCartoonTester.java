package com.xworkz.cartoon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cartoon.dao.cartoonDAO;
import com.xworkz.cartoon.dao.cartoonDAOImpl;
import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.cartoon.entity.CartoonEntity.ChannelName;

public class CreatListOfCartoonTester {

	public static void main(String[] args) {
	CartoonEntity entity1 = new CartoonEntity("Krishna", ChannelName.NICK, "Littel krishna", "English"); 
		CartoonEntity entity2 = new CartoonEntity( "Tom", ChannelName.POGO, "Tom and Jerry", "English"); 
	CartoonEntity entity3 = new CartoonEntity( "Jerry", ChannelName.POGO, "Tom and Jerry", "English"); 
	CartoonEntity entity4 = new CartoonEntity("Bheem", ChannelName.POGO, "Chota Bheem", "English"); 

	
        List<CartoonEntity> cartoons = new ArrayList<CartoonEntity>();
        cartoons.add(entity1);
        cartoons.add(entity2);
        cartoons.add(entity3);
        cartoons.add(entity4);

		cartoonDAO dao = new cartoonDAOImpl();
		
		dao.create(cartoons);
		
		
	}

}
