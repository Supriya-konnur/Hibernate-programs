package com.xworkz.waterfalls.dao;

import java.awt.AWTError;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.waterfalls.SFUtil;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class WaterFallsDAOImpl implements WaterFallsDAO {
	private SessionFactory factory = SFUtil.getfactory();

	public WaterFallsDAOImpl() {
		System.out.println("created" + this.getClass());
	}

	@Override
	public void create(WaterFallsEntity waterfallsEntity) {

		System.out.println("invoked");
		System.out.println("entity"+waterfallsEntity);
		try(Session session =factory.openSession()){
		Transaction transaction = session.beginTransaction();
		session.save(waterfallsEntity);
		transaction.commit();
		System.out.println("commit is succesfully");
	}
	}

	@Override
	public WaterFallsEntity getById(int id) {
		System.out.println("invoked getById");
	
		try(Session session =factory.openSession()){
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity dataFromDB = session.get(WaterFallsEntity.class, id);

			transaction.commit();
			System.out.println("commit is succesfully");	
			return dataFromDB;
		}
	}

	@Override
	public WaterFallsEntity updateHeightAndDepthById(int id, int height, int depth) {

		System.out.println("invoked upadate");
		try(Session session =factory.openSession()){
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity dataFromDB = session.get(WaterFallsEntity.class, id);
			if(dataFromDB!=null) {
				System.out.println("update name and id"+id);
				dataFromDB.setHeight(height);
				dataFromDB.setDepth(depth);
				session.update(dataFromDB);
				transaction.commit();
			}
			else {
				System.out.println("not upadated");
			}
			return dataFromDB;
		}
	}

	@Override
	public void deleteById(int id) {
		System.out.println("invoked delete");
		try(Session session =factory.openSession()){
			Transaction transaction = session.beginTransaction();
			WaterFallsEntity dataFromDB = session.get(WaterFallsEntity.class, id);
			if(dataFromDB!=null) {
				System.out.println("can delete");
				
				session.delete(dataFromDB);
				transaction.commit();
			}
			else {
				System.out.println("not deleted");
			}
	}
	}
}


