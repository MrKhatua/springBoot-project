package com.swiggy.userprofile.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.userprofile.entity.SwiggyEntity;
import com.swiggy.userprofile.request.SwiggyRequest;
import com.swiggy.userprofile.service.SwiggyService;

@RestController
public class SwiggyController {
	@Autowired
	SwiggyService swiggyService;
	@PostMapping("/generatedId")
	public String generateUserId(@RequestBody SwiggyRequest swiggyRequest) {

		System.out.println("User Details-------:");
		String firstName = swiggyRequest.getFirstName();
		String lastName = swiggyRequest.getLastName();
		String email = swiggyRequest.getEmail();

		System.out.println("firstName " + firstName);
		System.out.println("lastName " + lastName);
		System.out.println("email " + email);

		String base = (firstName + lastName).toLowerCase().replaceAll("[^a-z]", "");
		String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);

		//String userId = (base + random).substring(0, 8);
		
		String userId = swiggyService.swiggyRegister(swiggyRequest);
		return userId;
	}
	@GetMapping("/allUser")
	public List<SwiggyEntity> showAllUser() {
		List<SwiggyEntity> listAllUser = swiggyService.getAllUserData();
		return listAllUser;
	}
	@GetMapping("/editUser{id}")
	public String editUser(@RequestParam("id") Integer id) {
		String user = swiggyService.editUser(id);
		return user;
	}
}
