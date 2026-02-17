package com.kodewala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kodewala.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{
	@Query("SELECT o FROM OrderEntity o JOIN FETCH o.items")
	List<OrderEntity> findAllWithItems();
}
