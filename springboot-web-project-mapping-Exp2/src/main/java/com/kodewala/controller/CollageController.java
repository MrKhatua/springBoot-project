package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.dto.CollageRequest;
import com.kodewala.service.imple.CollageService;

@RestController
@RequestMapping("/Collage")
public class CollageController {
	@Autowired
	private CollageService collageService;
	@PostMapping("/register")
	public ResponseEntity<String> registerCollage(@RequestBody CollageRequest collageRequest){
		String response = collageService.addCollage(collageRequest);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
