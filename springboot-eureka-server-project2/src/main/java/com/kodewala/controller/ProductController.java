package com.kodewala.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@PostMapping("/create")
	public void createProduct() {
		System.out.println("Product Created:::::");
	}
}
