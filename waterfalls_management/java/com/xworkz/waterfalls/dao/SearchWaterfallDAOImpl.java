package com.xworkz.waterfalls.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.waterfalls.SFUtil;
import com.xworkz.waterfalls.entity.WaterFallsEntity;

public class SearchWaterfallDAOImpl extends WaterFallsDAOImpl implements SearchWaterFallDAO {

	private SessionFactory factory = SFUtil.getfactory();

	public SearchWaterfallDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public WaterFallsEntity findByLocaationAndName(String loc, String name) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT waterfall FROM WaterFallsEntity waterfall WHERE waterfall.name=:nm and waterfall.locatioon=:lc";
			Query<WaterFallsEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("nm", name);
			query.setParameter("lc", loc);			
			WaterFallsEntity entity = query.uniqueResult();


			return entity;
		}
	}

	@Override
	public String findLocationByName(String name) {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT waterfall.locatioon FROM WaterFallsEntity AS waterfall WHERE waterfall.name=:nm";
			Query<String> query = session.createQuery(hql);
			query.setParameter("nm", name);

			return query.uniqueResult();
		}
	}

	@Override
	public int findNoOfDeathsByLocationAndName(String loc, String name) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT waterfall.noOfDeath FROM WaterFallsEntity waterfall WHERE waterfall.name=:nm and waterfall.locatioon=:lc";
			Query<Integer> query = session.createQuery(hqlSyntax);

			query.setParameter("lc", loc);
			query.setParameter("nm", name);
			Integer entity = query.uniqueResult();
			return entity;
		}
	}

	@Override
	public Object[] findNoOfDeathsAndDestinationByLocationAndName(String loc, String name) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT waterfall.noOfDeath, waterfall.locatioon FROM WaterFallsEntity waterfall WHERE waterfall.name=:nm and waterfall.locatioon=:lc";
			Query<Object[]> query = session.createQuery(hqlSyntax);

			query.setParameter("lc", loc);
			query.setParameter("nm", name);
			
			return query.uniqueResult();
		}
	}

}
