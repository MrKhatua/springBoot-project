package com.amazon.profile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.amazon.profile.entity.ProfileEntity;
import com.amazon.profile.request.ProfileRequest;
import com.amazon.profile.service.ProfileService;

@Controller
public class ProfileController {
	@Autowired
	ProfileService profileService;
	@RequestMapping("createprofile")
	public String viewController() {
		System.out.println("profileController.viewController()");
		return "profilePage";
	}
	@PostMapping("profileCreatePage")
	public String profileCreate(@ModelAttribute ProfileRequest profileRequest) {
		System.out.println(profileRequest.getName() + ", "+profileRequest.getEmail()+", "+profileRequest.getMobile());
		profileService.doRegister(profileRequest);
		return "profileSuccess";
	}
	@GetMapping("getAllData")
	public String showAllData(Model model) {
		List<ProfileEntity> listProfile = profileService.getAllProfiles();
		model.addAttribute("profileList", listProfile);
		return "showAllData";
	}
	@PostMapping("updateProfile")
	public String updateProfile(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("mobile") double mobile) {
		profileService.updateProfile(id, name, email, mobile);
		return "redirect:getAllData";
	}
}
