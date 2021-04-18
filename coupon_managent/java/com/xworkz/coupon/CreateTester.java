package com.xworkz.coupon;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class CreateTester {

	public static void main(String[] args) {
		CouponEntity entity =new CouponEntity();
		entity.setName("Trends");
		entity.setType("dress");
		entity.setValidateMonth(3);
		entity.setCode("s123k");
		
		CouponDAO couponDAO = new CouponDAOImpl();
		couponDAO.create(entity);
		
		
		CouponEntity entity1 =new CouponEntity();
		entity1.setName("dominos");
		entity1.setType("food");
		entity1.setValidateMonth(3);
		entity1.setCode("s123k");
		
		
		CouponDAO couponDAO1 = new CouponDAOImpl();
		couponDAO1.create(entity1);
	}

}
