package com.xworkz.coupon.dao;

import java.util.List;

import com.xworkz.coupon.entity.CouponEntity;

public interface CouponDAO {

	public void create(CouponEntity couponEntity);

	public CouponEntity getById(int id);

	public CouponEntity updateValidateMonthById(int month, int id);

	public void deleteById(int id);

	public void create(List<CouponEntity> couponEntities);
}
