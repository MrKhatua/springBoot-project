package com.kodewala.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodewala.entity.UserEntity;
import com.kodewala.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserEntity saveUser(UserEntity user) {
		return userRepository.save(user);
	}
	
	public List<UserEntity> getAlldata(){
		return userRepository.findAll();
	}
	
	public UserEntity getById(int id) {
		return userRepository.findById(id).orElseThrow( ()->new IllegalArgumentException("Invalid actor id"));
	}
	
	public String updateById(UserEntity entity) 
	{
		
		  Optional<UserEntity>opt =userRepository.findById(entity.getId());
		  if(opt.isPresent())
		  {
			  userRepository.save(entity);
			  return "update successfull";
		  }
		  else
		  {
			  throw new IllegalArgumentException("Invalid id");
			  
		  }
	}
}
