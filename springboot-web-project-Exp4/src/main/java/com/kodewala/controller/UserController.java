package com.kodewala.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.dto.Userdto;

@RestController
@RequestMapping("/user")
public class UserController {
	List<Userdto> users = new ArrayList<Userdto>();
	@PostMapping
	public String addUser(@RequestBody Userdto user) {
		users.add(user);
		return "User Id created successfully";
	}
	@GetMapping
	public List<Userdto> getAllData() {
		return users;
	}
	@GetMapping("/{id}")
	public Userdto getSpecificiddata(@PathVariable int id) {
		for(Userdto u : users) {
			if( u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	@PutMapping("/{id}")
	public String updateMethod(@PathVariable int id) {
		for(Userdto u : users) {
			if(u.getId() == id) {
				u.setName(u.getName());
				u.setEmail(u.getEmail());
				
				return "User Updated Successfully";
			}
		}
		return "User not Found";
	}
}
