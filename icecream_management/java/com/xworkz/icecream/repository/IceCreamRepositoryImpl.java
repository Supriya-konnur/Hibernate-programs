package com.xworkz.icecream.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.icecream.entity.IceCreamEntity;

public class IceCreamRepositoryImpl implements IceCreamRepository {

	public IceCreamRepositoryImpl() {

	}

	@Override
	public IceCreamEntity persist(IceCreamEntity iceCreamEntity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(iceCreamEntity);
		session.getTransaction().commit();
		session.close();
		//factory.close();
		return iceCreamEntity;
	}

	@Override
	public List<IceCreamEntity> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("getAll");
		List<IceCreamEntity> list= query.getResultList();
		return list;
	}

	@Override
	public void updatePriceByName(String name, double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("updatePriceByName");
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		factory.close();
		session.close();

		
	}

	@Override
	public IceCreamEntity findByNameAndPrice(String name, double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		//session.getTransaction().begin();
		Query query = session.createNamedQuery("findByNameAndPrice");
		query.setParameter("nm", name);
		query.setParameter("pr", price);
		
		return (IceCreamEntity) query.getSingleResult();
	
	}

	@Override
	public IceCreamEntity getByMaxPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getByMaxPrice");

		return (IceCreamEntity) query.getSingleResult();
	}

	@Override
	public IceCreamEntity getByMinPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getMinPrice");
		

		return (IceCreamEntity) query.getSingleResult();
	}

	@Override
	public Double getBySumPrice() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getBySumPrice");
		return (Double) query.getSingleResult();
	}

	@Override
	public Double getPriceByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getPriceByName");
		query.setParameter("nm", name);
		
		return (Double) query.getSingleResult();
	}

	@Override
	public List<Object[]> getNameAndFlavourByPrice(double price) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		Query query = session.createNamedQuery("getNameAndFlavourByPrice");
		query.setParameter("pr", price);
		return query.getResultList();
	}

	@Override
	public void persist(List<IceCreamEntity> entities) {
		int count = 0;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		try {
			for (IceCreamEntity iceCreamEntity : entities) {
				session.persist(iceCreamEntity);
				count++;
				if (count == 5) {
					session.flush();
					count = 0;
				}

			}
			session.getTransaction().commit();
			System.out.println("committed successfully");

		} catch (Exception e) {
			// TODO: handle exception
			session.getTransaction().rollback();
		} finally {
			session.close();
		}

	}

	@Override
	public void deleteByName(String name) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		Query query = session.createNamedQuery("deleteByName");
		query.setParameter("nm", name);
		query.executeUpdate();
		session.getTransaction().commit();
		System.out.println("deleted successfully");
		session.close();
		
	}

}
