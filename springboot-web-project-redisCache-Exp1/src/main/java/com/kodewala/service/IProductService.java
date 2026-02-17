package com.kodewala.service;

import com.kodewala.dto.ProductRequest;

public interface IProductService {
	public String RegisterProduct(ProductRequest productRequest);
	public ProductRequest FindByName(String pName);
}
