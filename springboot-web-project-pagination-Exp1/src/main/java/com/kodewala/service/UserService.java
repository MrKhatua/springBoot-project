package com.kodewala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kodewala.entity.UserEntity;
import com.kodewala.repository.UserRepository;
import com.kodewala.request.UserRequest;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public int createUser(UserRequest userRequest) {
		UserEntity userEntity = new UserEntity();
		userEntity.setFirstName(userRequest.getFirstName());
		userEntity.setLastName(userRequest.getLastName());
		userEntity.setAddress(userRequest.getAddress());
		
		userEntity = userRepository.save(userEntity);
		
		return userEntity.getUserId();
	}
	
	public Page<UserEntity> getUser(int totalPage, int data) {
		Pageable pageable = PageRequest.of(totalPage, data);
		//Page<UserEntity>page = userRepository.findAll(pageable);
		return userRepository.findAll(pageable);
	}
}
