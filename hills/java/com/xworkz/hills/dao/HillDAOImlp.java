package com.xworkz.hills.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.hills.entity.HillsEntity;
import com.xworkz.hills.sfutil.SFUtil;

public class HillDAOImlp implements HillsDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public HillDAOImlp() {

	}

	@Override
	public void create(HillsEntity entity) {

		System.out.println("invoked");
		System.out.println("entity" + entity);
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("created succesfully");

		}
		
	}

	@Override
	public void create(List<HillsEntity> entries) {

		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();
		for (HillsEntity hillsEntity : entries) {
			session.save(hillsEntity);
		}
		transaction.commit();
		session.close();
	}

	@Override
	public HillsEntity getById(int id) {
		System.out.println("invoked getById");
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			HillsEntity dataFromDB = session.get(HillsEntity.class, id);
			transaction.commit();
			System.out.println("commit is succesfully");
			return dataFromDB;
		}
	}

	@Override
	public HillsEntity updateHeightById(int height, int id) {
		System.out.println("invoked upadate");
		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			HillsEntity dataFromDB = session.get(HillsEntity.class, id);
			if (dataFromDB != null) {
				dataFromDB.setHeight(height);
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
			HillsEntity dataFromDB = session.get(HillsEntity.class, id);
			if (dataFromDB != null) {
				session.delete(dataFromDB);
				transaction.commit();
			} else {
				System.out.println("not deleted");

			}

		}
	}

}
