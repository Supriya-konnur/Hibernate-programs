package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAO;
import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class GetByIdTester {

	public static void main(String[] args) {

		CouponDAO dao = new CouponDAOImpl();
		CouponEntity couponEntity = dao.getById(1);
		if (couponEntity != null) {
			System.out.println(couponEntity.getName());
			System.out.println(couponEntity);
		}
	}

}
