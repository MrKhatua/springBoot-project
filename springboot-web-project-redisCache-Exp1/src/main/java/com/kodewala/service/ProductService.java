package com.kodewala.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.kodewala.dto.ProductRequest;
import com.kodewala.entity.ProductEntity;
import com.kodewala.repository.ProductRepository;


@Service
public class ProductService implements IProductService{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public String RegisterProduct(ProductRequest productRequest) {
		Optional<ProductEntity> opt = productRepository.findBypName(productRequest.getpName());
		if(opt.isPresent()) {
			throw new IllegalArgumentException("Product Already Registered");
		}
		
		ProductEntity productEntity = new ProductEntity();

		productEntity.setpName(productRequest.getpName());
		productEntity.setpPrice(productRequest.getpPrice());
		productEntity.setQty(productRequest.getQty());
		productEntity.setDescription(productRequest.getDescription());
		
		productEntity = productRepository.save(productEntity);
		return "Successfully Product Registered, Product id : "+productEntity.getId();
	}
	@Override
	@Cacheable(value = "products-new", key = "#pName")
	public ProductRequest FindByName(String pName) {
		ProductRequest productRequest = new ProductRequest();
		
		ProductEntity response = productRepository.findBypName(pName).orElseThrow(() -> new IllegalArgumentException("Product is not present"));
		productRequest.setpName(response.getpName());
		productRequest.setpPrice(response.getpPrice());
		productRequest.setQty(response.getQty());
		productRequest.setDescription(response.getDescription());
		
		return productRequest;
	}	
	
	public String showAll() {
		ProductRequest productRequest = new ProductRequest();
		
		List<ProductEntity> response = productRepository.findAll();
		productRequest.setpName();
		return null;
	}
}
