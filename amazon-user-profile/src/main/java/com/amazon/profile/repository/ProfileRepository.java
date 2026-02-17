package com.amazon.profile.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.profile.entity.ProfileEntity;

@Repository
public class ProfileRepository {
	@Autowired
	SessionFactory sessionFactory;
	
	public Integer saveProfile(ProfileEntity entity) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Integer id =(Integer) session.save(entity);
		System.out.println(id);
		txn.commit();
		return id;
	}
	public List<ProfileEntity> getAllProfiles(){
		Session session = sessionFactory.openSession();
		List<ProfileEntity> list = session.createQuery("from ProfileEntity", ProfileEntity.class).list();
		return list;
	}
	
	public void updateProfile(int id, String name, String email, double mobile) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		ProfileEntity p = session.get(ProfileEntity.class, id);
		if(p != null) {
			p.setName(name);
			p.setEmail(email);
			p.setMobile(mobile);
			session.update(p);
		}
		tx.commit();
	}
}
