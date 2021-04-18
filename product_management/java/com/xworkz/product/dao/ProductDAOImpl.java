package com.xworkz.product.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.coupon.sfutil.SFUtil;
import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.entity.ProductEntity.ProductType;

public class ProductDAOImpl implements ProductDAO {

	private SessionFactory factory = SFUtil.getFactory();

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void persist(ProductEntity productEntity) {
		System.out.println("invoked");
		System.out.println("entity" + productEntity);
		Session session = null;
		try {
			session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			session.save(productEntity);
			transaction.commit();
			System.out.println("commit is succesfully");
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public ProductEntity findByNameAndManufacturer(String name, String manu) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT product FROM ProductEntity product WHERE product.name=:nm and product.manufacturer=:mf";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("nm", name);
			query.setParameter("mf", manu);
			ProductEntity entity = query.uniqueResult();

			return entity;
		}

	}

	@Override
	public ProductEntity findByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT product FROM ProductEntity product WHERE product.type=:tp and product.brand=:br and name=:nm";
			Query<ProductEntity> query = session.createQuery(hql);
			query.setParameter("tp", type);
			query.setParameter("br", brand);
			query.setParameter("nm", name);
			ProductEntity entity = query.uniqueResult();

			return entity;
		}
	}

	@Override
	public Double findPriceByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT product.price FROM ProductEntity product WHERE product.type=:tp and product.brand=:br and name=:nm";
			Query<Double> query = session.createQuery(hql);
			query.setParameter("tp", type);
			query.setParameter("br", brand);
			query.setParameter("nm", name);
			Double entity1 = query.uniqueResult();

			return entity1;
		}
	}

	@Override
	public Object[] findPriceAndQuantityByTypeAndBrandAndName(String name, String brand, ProductType type) {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT product.price, product.quantity FROM ProductEntity product WHERE product.type=:tp and product.brand=:br and name=:nm";
			Query<Object[]> query = session.createQuery(hql);
			query.setParameter("tp", type);
			query.setParameter("br", brand);
			query.setParameter("nm", name);

			return query.uniqueResult();
		}
	}

	@Override
	public ProductEntity findByTypeAndBrandAndQuality(String name, String brand, boolean quality) {
		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT product FROM ProductEntity product WHERE product.name=:nm and product.brand=:br and product.quality=:ql";
			Query<ProductEntity> query = session.createQuery(hqlSyntax);
			query.setParameter("nm", name);
			query.setParameter("br", brand);
			query.setParameter("ql", quality);

			ProductEntity entity = query.uniqueResult();

			return entity;
		}

	}

	@Override
	public Object[] findnameAndTypeById(int id) {

		try (Session session = this.factory.openSession()) {
			String hqlSyntax = "SELECT product.name,product.type FROM ProductEntity product WHERE product.pid=:id";
			Query<Object[]> query = session.createQuery(hqlSyntax);
			query.setParameter("id", id);

			return query.uniqueResult();
		}

	}

	@Override
	public int findMaxId() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT max(pid) FROM ProductEntity";
			Query<Integer> query = session.createQuery(hql);
			return query.uniqueResult();
		}
	}

	@Override
	public long findSize() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT count(*) FROM ProductEntity";
			Query<Long> query = session.createQuery(hql);
			return query.uniqueResult();
		}
	}

	@Override
	public Double findMaxPrice() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT max(price) FROM ProductEntity";
			Query<Double> query = session.createQuery(hql);
			return query.uniqueResult();
		}
	}

	@Override
	public Double findSumOfPrice() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT sum(price) FROM ProductEntity";
			Query<Double> query = session.createQuery(hql);
			return query.uniqueResult();
		}
	}

	@Override
	public Integer findMinId() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT min(pid) FROM ProductEntity";
			Query<Integer> query = session.createQuery(hql);
			return query.uniqueResult();
		}

	}

	@Override
	public List<Object> findDistinct() {
		try (Session session = this.factory.openSession()) {
			String hql = "SELECT DISTINCT(product) FROM ProductEntity product";
			Query<Object> query = session.createQuery(hql);
			return query.getResultList();
		}

	}

	@Override
	public void updateBrandByName(String brand,String name) {
		try (Session session = this.factory.openSession()) {
			Transaction transaction=session.beginTransaction();
			Query<ProductEntity> entity=session.createNamedQuery("updateBrandByName");
			entity.setParameter("br", brand);
			entity.setParameter("nm", name);
			entity.executeUpdate();
			transaction.commit();
		}
	}

	@Override
	public List<ProductEntity> findAll() {
		try (Session session = this.factory.openSession()) {
			Query<ProductEntity> query = session.createNamedQuery("findAll");
			List<ProductEntity> list = query.list();

			return list;
		}
	}

	@Override
	public List<ProductEntity> findAllIds() {
		try (Session session = this.factory.openSession()) {
			Query<ProductEntity> query = session.createNamedQuery("findAllIds");
			List<ProductEntity> list = query.list();

			return list;
		}
	}

}
