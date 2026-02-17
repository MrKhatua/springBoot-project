package com.kodewala.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.UserEntity;
import com.kodewala.request.UserRequest;
import com.kodewala.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/createUser")
	public String createUser(@RequestBody UserRequest userRequest) {
		int response = userService.createUser(userRequest);
		return "Successfully Created : "+response;
	}
	
	@GetMapping("/showUser")
	public Page<UserEntity> showUser(@RequestParam int totalPage,@RequestParam int data){
		return userService.getUser(totalPage, data);
		
	}
}
