package com.amazon.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.profile.entity.ProfileEntity;
import com.amazon.profile.repository.ProfileRepository;
import com.amazon.profile.request.ProfileRequest;

@Service
public class ProfileService {
	@Autowired
	ProfileRepository profileRepository;
	
	public Integer doRegister(ProfileRequest request) {
		
		ProfileEntity entity = new ProfileEntity();
		entity.setName(request.getName());
		entity.setEmail(request.getEmail());
		entity.setMobile(request.getMobile());
		Integer id = profileRepository.saveProfile(entity);
		return id;
	}
	
	public List<ProfileEntity> getAllProfiles(){
		return profileRepository.getAllProfiles();
	}
	
	public void updateProfile(int id, String name, String email, double mobile) {
		profileRepository.updateProfile(id, name, email, mobile);
		
	}
}
