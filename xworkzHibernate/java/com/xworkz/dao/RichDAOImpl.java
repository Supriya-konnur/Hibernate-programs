package com.xworkz.dao;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.RichEntity;

public class RichDAOImpl implements RichDAO{

	@Override
	public void create(RichEntity richEntity) {

		System.out.println("Created RichDAO Implimentation");
		System.out.println("Entity :" + richEntity);

		Configuration cgf = new Configuration();
		cgf.configure("resource/hibernate.cfg.xml");
		cgf.addAnnotatedClass(RichEntity.class);
		SessionFactory sessionFactory = cgf.buildSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		session.save(richEntity);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
