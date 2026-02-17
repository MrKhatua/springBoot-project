package com.bigbasket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bigbasket.request.ProductRequest;
import com.bigbasket.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	@PostMapping("/insertData")
	public ResponseEntity<String> insertProduct(@RequestBody ProductRequest request){
		String result = productService.inserProduct(request);
		return new ResponseEntity<String>(result,HttpStatus.CREATED);
	}
	@GetMapping("/search/{pname}")
	public ResponseEntity<ProductRequest> searchProduct(@PathVariable("pname") String pname){
		ProductRequest result = productService.getProductByName(pname);
		return new ResponseEntity<ProductRequest>(result,HttpStatus.OK);
	}
}
