package com.mesho.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mesho.product.entity.ProductEntity;
import com.mesho.product.request.ProductRequest;
import com.mesho.product.service.ProductService;

@RestController
@RequestMapping("/mesho")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/placeOrder")
	public String createOrder(@RequestBody ProductRequest request) {
		String order = productService.createOrder(request);
		return order;	
	}
	@GetMapping
	public Iterable<ProductEntity> seeAllOrderDetails(){
		return productService.seeAllData();
	}
	@GetMapping("/{pName}")
	public Iterable<ProductEntity>  seeByName(@PathVariable String pName) {
		return productService.getByName(pName);
	}
	
	@DeleteMapping("/{id}")
	public String deleteOrderById(@PathVariable int id) {
		String responce = productService.deleteOrder(id);
		return responce;
	}
	
}
