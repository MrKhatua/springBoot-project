package com.handpicked.profile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handpicked.profile.entity.Profile;
import com.handpicked.profile.repository.ProfileRepository;
import com.handpicked.profile.request.ProfileRequest;

@Service
public class ProfileService {
@Autowired
private ProfileRepository profileRepository;

public String registerUser(ProfileRequest request)
{
	System.out.println("ProfileService.registerUser()");
     Profile entity=new Profile();
     entity.setName(request.getName());
     entity.setEmail(request.getEmail());
     entity.setMobile(request.getMobile());
    String result=profileRepository.saveProfile(entity);
    System.out.println(result);
    
    return "The user is register successfully with id"+result;
     
}
public List<Profile> findAllUser()
{
	List<Profile> listUser=profileRepository.getAllUser();
	return listUser;
}

public  Profile editUser(Integer id)
{
	return profileRepository.editUser(id);
	
}

public String updateUser(ProfileRequest request)
{
       Profile profile  =profileRepository.editUser(request.getId());
       profile.setName(request.getName());
       profile.setEmail(request.getEmail());
       profile.setMobile(request.getMobile());
       profileRepository.updateUser(profile);
       return "User Updated successfully";
}
public String deleteUser(Integer id)
{
	Profile profile=editUser(id);
	profile.setActive(false);
	profileRepository.updatStatus(profile);
	return "User deleted successfulyy";
}

}
