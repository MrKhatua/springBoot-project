package com.swiggy.userprofile.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.ProfileEntity;
import com.swiggy.userprofile.entity.SwiggyEntity;

@Repository
public class SwiggyRepository {
	@Autowired
	SessionFactory sessionFactory;
	public String saveSwiggyProfile(SwiggyEntity entity) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		Integer id = (Integer)session.save(entity);
		tnx.commit();
		return "The user save with id : "+id;	
	}
	
	public List<SwiggyEntity> getAllUser(){
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
	    List<SwiggyEntity> userLists = session.createQuery("from SwiggyEntity", SwiggyEntity.class).list();
	    tnx.commit();
	    return userLists;   
	} 
	public SwiggyEntity editUser(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction tnx = session.beginTransaction();
		SwiggyEntity user = session.get(SwiggyEntity.class, id);
		tnx.commit();
	}
}
