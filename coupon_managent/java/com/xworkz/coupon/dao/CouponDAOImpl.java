package com.xworkz.coupon.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.entity.CouponEntity;
import com.xworkz.coupon.sfutil.SFUtil;

public class CouponDAOImpl implements CouponDAO {
	private SessionFactory factory = SFUtil.getFactory();

	public CouponDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(CouponEntity couponEntity) {
		System.out.println("invoked");
		System.out.println("entity" + couponEntity);

		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(couponEntity);
			transaction.commit();
			System.out.println("created succesfully");

		}

	}

	@Override
	public CouponEntity getById(int id) {
		System.out.println("invoked");

		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity dataFromDB = session.get(CouponEntity.class, id);
			transaction.commit();
			System.out.println("commit successsfully");

			return dataFromDB;
		}
	}

	@Override
	public CouponEntity updateValidateMonthById(int month, int id) {
		System.out.println("invoked update");
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity dataFromDB = session.get(CouponEntity.class, id);
			if (dataFromDB != null) {
				dataFromDB.setValidateMonth(month);
				session.update(dataFromDB);
				transaction.commit();
			} else {
				System.out.println("not upadated");
			}

			return dataFromDB;
		}
	}

	@Override
	public void deleteById(int id) {

		System.out.println("invoked delete");
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			CouponEntity dataFromDB = session.get(CouponEntity.class, id);
			if (dataFromDB != null) {
				session.delete(dataFromDB);
				transaction.commit();
			} else {
				System.out.println("not deleted");

			}

		}
	}

	@Override
	public void create(List<CouponEntity> couponEntities) {
		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();
		for (CouponEntity couponEntity : couponEntities) {
			session.save(couponEntity);
		}
		transaction.commit();
		session.close();
	}

	

}
