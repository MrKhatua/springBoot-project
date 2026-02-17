package com.kodewala.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.entity.InvoiceEntity;

@RestController
public class InvoiceController {
	@PostMapping("/invoice")
	public ResponseEntity<String> invoiceMethod(@RequestBody InvoiceEntity entity){
		System.out.println("InvoiceController.invoiceMethod()");
		return new ResponseEntity<String>("Invoice id : ADS5454524242"+entity.getCustomerId()+"AX",HttpStatus.CREATED);
		
	}
}
