package com.xworkz.coupon;

import com.xworkz.coupon.dao.CouponDAOImpl;

public class DeleteteTester {

	public static void main(String[] args) {

		new CouponDAOImpl().deleteById(1);
	}

}
