package com.kodewala.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.PaymentEntity;

@RestController
@RequestMapping("/zepto")
public class PaymentController {
	@PostMapping("/processpayment")
	public String paymentConfirmation(@RequestBody PaymentEntity entity) {
		return "Payment Successfull. Details : "+entity;
	}
}
