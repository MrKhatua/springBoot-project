package com.bigbasket.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bigbasket.entity.UserEntity;

@Repository
public class BigbasketRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer createUser(UserEntity entity) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		Integer id = (Integer)session.save(entity);
		tnx.commit();
		return id;
	}
	
	public UserEntity findUserByEmail(String _email) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		UserEntity entity = session.createQuery("from UserEntity where email=:email", UserEntity.class).setParameter("email",_email).uniqueResult();
		tnx.commit();
		return entity;
	}
}
