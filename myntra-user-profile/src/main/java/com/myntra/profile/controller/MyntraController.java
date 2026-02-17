package com.myntra.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myntra.profile.request.MyntraRequest;
import com.myntra.profile.request.ProfileRequest;

@Controller
public class MyntraController {
	@RequestMapping("createMyntraAccount")
	public String viewControllerMethod() {
		System.out.println("MyntraController.viewControllerMethod()---start");
		return "insertProfileDetails";
	}
	@PostMapping("saveProfileDetails")
	public String saveProfile(@ModelAttribute MyntraRequest myntrareq, Model model) {
		System.out.println("Id : "+myntrareq.getId());
		System.out.println("Name : "+myntrareq.getName());
		System.out.println("Email : "+myntrareq.getEmail());
		System.out.println("Mobile : "+myntrareq.getMobile());
		model.addAttribute("user", myntrareq);
		System.out.println(myntrareq);
		return "profileSaveSuccessfully";
	}
}
