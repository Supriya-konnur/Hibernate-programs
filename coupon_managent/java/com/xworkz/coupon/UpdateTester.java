package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAOImpl;
import com.xworkz.coupon.entity.CouponEntity;

public class UpdateTester {

	public static void main(String[] args) {

		CouponEntity couponEntity = new CouponDAOImpl().updateValidateMonthById(4, 1);
	}

}
