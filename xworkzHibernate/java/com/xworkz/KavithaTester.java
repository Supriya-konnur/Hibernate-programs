package com.xworkz;

import com.xworkz.dao.RichDAO;

import com.xworkz.dao.RichDAOImpl;
import com.xworkz.entity.RichEntity;

public class KavithaTester {

	public static void main(String[] args) {

		RichEntity richEntity = new RichEntity();

		richEntity.setName("Bill Gates");
		richEntity.setNetWorthInBillions(134);
		richEntity.setCountry("USA");
		richEntity.setRank(3);
		richEntity.setMarried(true);
		richEntity.setBusiness("Software");
		richEntity.setId(1);

		RichDAO richDAO = new RichDAOImpl();

		richDAO.create(richEntity);

	}

}
