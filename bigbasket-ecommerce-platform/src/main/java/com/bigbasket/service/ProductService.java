package com.bigbasket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigbasket.entity.ProductEntity;
import com.bigbasket.repository.ProductRepository;
import com.bigbasket.request.ProductRequest;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public String inserProduct(ProductRequest request) {
		ProductEntity product = productRepository.getProductByName(request.getPname());
		
		if(product != null) {
			throw new IllegalArgumentException("Product already inserted......");
		}
		ProductEntity productEntity = new ProductEntity();
		productEntity.setPname(request.getPname());
		productEntity.setPprice(request.getPprice());
		productEntity.setDescription(request.getDescription());
		
		Integer id = productRepository.SaveProduct(productEntity);
		return request.getPname()+" is inserted with id "+id;
	}
	
	public ProductRequest getProductByName(String name) {
		ProductEntity product = productRepository.getProductByName(name);
		
		ProductRequest productRequest = new ProductRequest();
		productRequest.setPid(product.getPid());
		productRequest.setPname(product.getPname());
		productRequest.setPprice(product.getPprice());
		productRequest.setDescription(product.getDescription());
		
		return productRequest;
		
	}
	
}
