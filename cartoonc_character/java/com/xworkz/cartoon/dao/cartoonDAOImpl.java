package com.xworkz.cartoon.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.cartoon.entity.CartoonEntity;
import com.xworkz.coupon.sfutil.SFUtil;

public class cartoonDAOImpl implements cartoonDAO {

	private SessionFactory factory = SFUtil.getFactory();
	
	public cartoonDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(CartoonEntity cartoonEntity) {

		System.out.println("invoked");
		System.out.println("entity" + cartoonEntity);

		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(cartoonEntity);
			transaction.commit();
			System.out.println("created succesfully");

		}

	}

	@Override
	public void create(List<CartoonEntity> cartoonEntities) {
		Session session=null;
		try {
			 session = this.factory.openSession();

			int count = 0;
			Transaction transaction = session.beginTransaction();
			for (CartoonEntity cartoonEntity : cartoonEntities) {
				session.save(cartoonEntity);
				count++;
				if (count == 5) {
					session.flush();
					count = 0;
					System.out.println("flush is used");
				}
			}

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

	}

	@Override
	public CartoonEntity findByName(String name) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT CART FROM CartoonEntity CART WHERE CART.name='" + name + "'";
			Query<CartoonEntity> query = session.createQuery(hqlSyntax);
			CartoonEntity cartoonEntity = query.uniqueResult();

			return cartoonEntity;

		}
	}

//	@Override
//	public CartoonEntity getById(int id) {
//		System.out.println("invoked");
//
//		try (Session session = this.factory.openSession()) {
//			Transaction transaction = session.beginTransaction();
//			CartoonEntity dataFromDB = session.get(CartoonEntity.class, id);
//			transaction.commit();
//			System.out.println("commit successsfully");
//
//			return dataFromDB;
//		}
//
//	}
//
//	@Override
//	public CartoonEntity updateNameById(String name, int id) {
//		System.out.println("invoked update");
//		try (Session session = this.factory.openSession()) {
//			Transaction transaction = session.beginTransaction();
//			CartoonEntity dataFromDB = session.get(CartoonEntity.class, id);
//			if (dataFromDB != null) {
//				dataFromDB.setName(name);
//				session.update(dataFromDB);
//				transaction.commit();
//			} else {
//				System.out.println("not upadated");
//			}
//
//			return dataFromDB;
//		}
//	}
//
//	@Override
//	public CartoonEntity deleteById(int id) {
//		System.out.println("invoked update");
//		try (Session session = this.factory.openSession()) {
//			Transaction transaction = session.beginTransaction();
//			CartoonEntity dataFromDB = session.get(CartoonEntity.class, id);
//			if (dataFromDB != null) {
//				session.delete(dataFromDB);
//				transaction.commit();
//			} else {
//				System.out.println("not deleted");
//
//			}
//
//			return dataFromDB;
//		}
//	}

}
