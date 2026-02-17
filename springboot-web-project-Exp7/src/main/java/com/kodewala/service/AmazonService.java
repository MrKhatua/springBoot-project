package com.kodewala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.AmazonEntity;
import com.kodewala.repository.AmazonRepository;

@Service
public class AmazonService {
	@Autowired
	AmazonRepository amazonRepository;
	public AmazonEntity saveUser(AmazonEntity entity) {
		AmazonEntity saveEntity = amazonRepository.save(entity);
		return saveEntity;
	}
	
	public List<AmazonEntity> getAllData(){
		return amazonRepository.findAll();
	}
	
	public AmazonEntity getById(int id) {
		AmazonEntity getUserById = amazonRepository.findById(id).orElseThrow(() ->new IllegalArgumentException("invalid id"));
		return getUserById;
	}
	
	public String updateUser(int id, AmazonEntity updateEntity) {
		updateEntity.set
		return null;
		
	}
}
