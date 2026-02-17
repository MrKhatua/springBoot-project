package com.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.entity.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity, Integer>{

}
