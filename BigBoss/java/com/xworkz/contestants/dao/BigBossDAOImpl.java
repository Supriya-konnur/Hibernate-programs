package com.xworkz.contestants.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.contestants.costants.AppCostants;
import com.xworkz.contestants.entity.ContestantEntity;

public class BigBossDAOImpl implements BigBossDAO {

	@Override
	public void create(ContestantEntity contestantEntity) {
		// TODO Auto-generated method stub
		System.out.println("Created BigBoss Implimentation");
		System.out.println("Entity :" + contestantEntity);

		Configuration cgf = new Configuration();
		cgf.configure("resources/hibernate.cfg.xml");
		cgf.addAnnotatedClass(ContestantEntity.class);
		SessionFactory sessionFactory = cgf.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(contestantEntity);
		transaction.commit();
		session.close();
		sessionFactory.close();

	}

	@Override
	public ContestantEntity getById(int id) {

		Configuration cgf = new Configuration();
		cgf.configure("resources/hibernate.cfg.xml");
		cgf.addAnnotatedClass(ContestantEntity.class);
		SessionFactory sessionFactory = cgf.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		ContestantEntity dataFromDB = session.get(ContestantEntity.class, id);

		transaction.commit();
		session.close();
		sessionFactory.close();
		return dataFromDB;
	}

	@Override
	public ContestantEntity updateNoOfTasksAndDaysIn(int id, int noOfTask, int daysIn) {
		SessionFactory factory=new Configuration().configure(AppCostants.HIBERNATE_CONFIG_LOCATION)
				.addAnnotatedClass(ContestantEntity.class)
				.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		ContestantEntity dataFromDB = session.get(ContestantEntity.class, id);
		if(dataFromDB!=null) {
			System.out.println("update");
			dataFromDB.setNoOfTasks(noOfTask);
			dataFromDB.setDaysIn(daysIn);
			session.update(dataFromDB);
			transaction.commit();
			
		}
		else {
			System.out.println("cant update");
		}
		//transaction.close();
		return dataFromDB;
	}

	@Override
	public void deleteById(int id) {
		SessionFactory factory=new Configuration().configure(AppCostants.HIBERNATE_CONFIG_LOCATION)
				.addAnnotatedClass(ContestantEntity.class)
				.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction();
		ContestantEntity dataFromDB = session.get(ContestantEntity.class, id);
		if(dataFromDB!=null) {
			System.out.println("deleted");
			session.delete(dataFromDB);
			transaction.commit();
		}
		
			else {
				System.out.println("cant deleted");
			}
			
		
	}

}
