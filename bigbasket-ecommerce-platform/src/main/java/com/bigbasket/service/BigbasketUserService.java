package com.bigbasket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigbasket.entity.UserEntity;
import com.bigbasket.repository.BigbasketRepository;
import com.bigbasket.request.UserEntityRequest;

@Service
public class BigbasketUserService {
	@Autowired
	private BigbasketRepository bigbasketRepository;
	
	public String bigbasketRegister(UserEntityRequest request) 
	{
		UserEntity user = bigbasketRepository.findUserByEmail(request.getEmail());
		
		if(user != null) {
			throw new IllegalArgumentException("User already Exist");
		}
		
		String password = new java.util.Random().ints(8, 0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".length()).mapToObj(i -> "" + "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(i)).reduce("", String::concat);
		UserEntity entity = new UserEntity();
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		entity.setPassword(password);
				
			bigbasketRepository.createUser(entity);
			return "Successfully Created......Email id : "+entity.getEmail()+"and Password : "+password;
	}
	
	public String loginUser(UserEntityRequest request) {
		UserEntity user = bigbasketRepository.findUserByEmail(request.getEmail());
		
		if(request.getEmail().equals( user.getEmail()) && request.getPassword() .equals( user.getPassword())) {
			return "Login Successfully";
		}
		else {
			throw new IllegalArgumentException("Incorrect User Id or Password");
		}
	}
}
