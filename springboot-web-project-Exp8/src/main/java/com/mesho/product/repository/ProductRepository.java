package com.mesho.product.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mesho.product.entity.ProductEntity;

public interface ProductRepository extends CrudRepository<ProductEntity, Integer>{
       Iterable<ProductEntity> findByPName(String pName);
}
