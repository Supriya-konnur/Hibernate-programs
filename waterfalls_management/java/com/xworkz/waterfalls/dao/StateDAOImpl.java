package com.xworkz.waterfalls.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfalls.SFUtil;
import com.xworkz.waterfalls.entity.StateEntity;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class StateDAOImpl implements StateDAO {

	private SessionFactory factory = SFUtil.getfactory();

	public StateDAOImpl() {

	}

	@Override
	public void create(StateEntity entity) {

		System.out.println("invoked create");
		System.out.println("entity" + entity);

		try (Session session = this.factory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
			System.out.println("created succesfully");
		}
	}

	@Override
	public void create(List<StateEntity> entities) {

		Session session = this.factory.openSession();
		Transaction transaction = session.beginTransaction();
		for (StateEntity stateEntity : entities) {
			session.save(stateEntity);
		}
		transaction.commit();
		session.close();
	}

	@Override
	public void create(WaterFallsEntity wentity, StateEntity sentity1) {
		Transaction transaction = null;
		System.out.println("invoking create");
		System.out.println("waterFalls entity" + wentity);
		System.out.println("State entity" + sentity1);

		try (Session session = this.factory.openSession()) {

			transaction = session.beginTransaction();
			session.save(wentity);
			session.flush();
			session.save(sentity1);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
