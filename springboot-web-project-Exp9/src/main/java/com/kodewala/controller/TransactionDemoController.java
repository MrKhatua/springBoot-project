package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.service.TransactionDemoService;

@RestController
@RequestMapping("/tx")
public class TransactionDemoController {
	@Autowired
	TransactionDemoService demoService;
	
	@GetMapping("/test")
	public String testTransaction() {
		demoService.saveUserAndAudit();
		return "Success";
	}
}
