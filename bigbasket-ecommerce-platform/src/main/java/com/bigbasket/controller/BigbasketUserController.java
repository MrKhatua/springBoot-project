package com.bigbasket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.request.UserEntityRequest;
import com.bigbasket.service.BigbasketUserService;

@RestController
public class BigbasketUserController {
	@Autowired
	BigbasketUserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody UserEntityRequest request) {
		String result = userService.bigbasketRegister(request);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	@GetMapping("/login")
	public ResponseEntity<String> loginUser(@RequestBody UserEntityRequest request){
		System.out.println("BigbasketUserController.loginUser()");
		System.out.println(request);
		String message = userService.loginUser(request);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
}
