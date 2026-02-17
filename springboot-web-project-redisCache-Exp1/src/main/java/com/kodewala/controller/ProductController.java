package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodewala.dto.ProductRequest;
import com.kodewala.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@PostMapping("/register")
	public String RegisterProduct(@RequestBody ProductRequest proRequest) {
		return productService.RegisterProduct(proRequest);
	}
	@GetMapping("/showProduct/{pName}")
	public ProductRequest ShowProductByName(@PathVariable String pName) {
		return productService.FindByName(pName);
	}
}
