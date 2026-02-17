package com.kodewala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.UserEntity;
import com.kodewala.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	@PostMapping
	public UserEntity createUser(@RequestBody UserEntity entity) {
		return userService.saveUser(entity);
	}
	
	@GetMapping
	public List<UserEntity> getAllData(){
		return userService.getAlldata();
	}
	
	@GetMapping("/{id}")
	public UserEntity getbyid(@PathVariable int id) {
		return userService.getById(id);
	}
	
	@PutMapping
	public String updateUser( @RequestBody UserEntity user) {
		return userService.updateById(user);
	}
}
