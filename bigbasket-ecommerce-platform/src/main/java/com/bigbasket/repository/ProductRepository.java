package com.bigbasket.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigbasket.entity.ProductEntity;

@Repository
public class ProductRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer SaveProduct(ProductEntity productEntity) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		Integer id =(Integer) session.save(productEntity);
		tnx.commit();
		return id;
	}
	
	public ProductEntity getProductByName(String name) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		ProductEntity product = session.createQuery("from ProductEntity where pname=:pname",ProductEntity.class).setParameter("pname", name).uniqueResult();
		tnx.commit();
		return product;
	}
}
