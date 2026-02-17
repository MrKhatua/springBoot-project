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

import com.kodewala.entity.AmazonEntity;
import com.kodewala.service.AmazonService;

@RestController
@RequestMapping("/user")
public class AmazonController {
	@Autowired
	AmazonService amazonService;
	@PostMapping
	public AmazonEntity createUser(@RequestBody AmazonEntity entity) {
		AmazonEntity user = amazonService.saveUser(entity);
		return user;
	}
	
	@GetMapping
	public List<AmazonEntity> seeAllData(){
		return amazonService.getAllData();
	}
	
	@GetMapping("/{id}")
	public AmazonEntity seeByid(@PathVariable int id) {
		AmazonEntity getData = amazonService.getById(id);
		return getData;
	}
	
	@PutMapping()
	public AmazonEntity updateByid(@RequestBody AmazonEntity amazonEntity, int id) {
		return amazonService.up
	}
}
