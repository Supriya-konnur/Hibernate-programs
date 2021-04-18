package com.xworkz.waterfalls;

import com.xworkz.waterfalls.dao.WaterFallsDAOImpl;

public class TesterDelete {

	public static void main(String[] args) {

		new WaterFallsDAOImpl().deleteById(2);
	}

}
