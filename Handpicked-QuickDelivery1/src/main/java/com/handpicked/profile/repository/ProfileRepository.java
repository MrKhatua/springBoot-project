package com.handpicked.profile.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.handpicked.profile.entity.Profile;


@Repository
public class ProfileRepository {
@Autowired
private SessionFactory sessionFactory;	
	
	public String saveProfile(Profile profile)
	{
		
		 Session session=sessionFactory.openSession();
		  Transaction tnx=session.beginTransaction();
		  Integer id=(Integer)session.save(profile);
		  tnx.commit();
	return "The user is saved With id "+id;
	}
	public List<Profile> getAllUser() 
	{
		Session session=sessionFactory.openSession();
		Transaction tnx=session.beginTransaction();
         List<Profile> users=session.createQuery("from Profile where active=true",Profile.class).list();
         tnx.commit();
         return users;
	}
	
	public Profile editUser(Integer id)
	{
		     Session session=sessionFactory.openSession();
			Transaction tnx=session.beginTransaction();
		     Profile user=session.get(Profile.class, id);
		     tnx.commit();
		   return user;
	}
	public void updateUser(Profile profile)
	{
		Session session=sessionFactory.openSession();
		Transaction tnx=session.beginTransaction();
		  session.update(profile);
		  tnx.commit();
		 
	}
	public void updatStatus(Profile profile)
	{
		Session session=sessionFactory.openSession();
		Transaction tnx=session.beginTransaction();
		  session.update(profile);
		  tnx.commit();
	}
}
