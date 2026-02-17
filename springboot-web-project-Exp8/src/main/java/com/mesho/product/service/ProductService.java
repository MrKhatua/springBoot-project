package com.mesho.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mesho.product.entity.ProductEntity;
import com.mesho.product.repository.ProductRepository;
import com.mesho.product.request.ProductRequest;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	public String createOrder(ProductRequest entity) 
	{
		ProductEntity productEntity = new ProductEntity();
		
		productEntity.setpName(entity.getpName());
		productEntity.setQty(entity.getQty());
		productEntity.setpPrice(entity.getpPrice());
		productEntity.setDescription(entity.getDescription());
		
	   ProductEntity saveEntity =productRepository.save(productEntity);
		return "Order Placed Successfully. Order Id : "+saveEntity.getId();
	}
	
	public Iterable<ProductEntity> seeAllData(){
		ProductService productService = new ProductService();
		productService.set
		return productRepository.findAll();
	}
	
	public Iterable<ProductEntity> getByName(String pName) {
		Iterable<ProductEntity> getByName =  productRepository.findByPName(pName);
		 return getByName;
	}
	
	public String deleteOrder(int id) {
		if(productRepository.existsById(id)) {
			productRepository.deleteById(id);
			return "Successfully Order deleted. Order Id : "+id;
		}
		return "Order id is not present";	
	}
}
