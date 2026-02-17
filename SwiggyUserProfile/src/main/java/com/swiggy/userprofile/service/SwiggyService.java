package com.swiggy.userprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.userprofile.entity.SwiggyEntity;
import com.swiggy.userprofile.repository.SwiggyRepository;
import com.swiggy.userprofile.request.SwiggyRequest;

@Service
public class SwiggyService {
	@Autowired
	SwiggyRepository swiggyRepository;
	public String swiggyRegister(SwiggyRequest swiggyRequest) {
		SwiggyEntity entity = new SwiggyEntity();
		entity.setFirstName(swiggyRequest.getFirstName());
		entity.setLastName(swiggyRequest.getLastName());
		entity.setEmail(swiggyRequest.getEmail());
		String result = swiggyRepository.saveSwiggyProfile(entity);
		System.out.println(result);
		return "User iD : "+ (result);
	}
	
	public List<SwiggyEntity> getAllUserData(){
		List<SwiggyEntity> listUser = swiggyRepository.getAllUser();
		return listUser;
	}
	public SwiggyEntity editUser(Integer id) {
		return swiggyRepository.editUser(id);
	}
}
