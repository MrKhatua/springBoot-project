package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.AuditEntity;
import com.kodewala.entity.UserEntity;
import com.kodewala.repository.AuditRepository;
import com.kodewala.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionDemoService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	AuditRepository auditRepository;
	
	@Transactional
	public void saveUserAndAudit() {
//		UserEntity userEntity = new UserEntity();
//		userEntity.setName("Manoj");
//		userRepository.save(userEntity);
//		
//		AuditEntity auditEntity = new AuditEntity();
//		auditEntity.setAction("User_Created");
//		auditRepository.save(auditEntity);
//		
//		if(true) {
//			throw new RuntimeException("Something went wrong");
//		}
		
		 userRepository.save(new UserEntity("Manoj"));
		    auditRepository.save(new AuditEntity("USER_CREATED"));
	}
}
