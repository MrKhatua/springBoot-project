package com.uber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.entity.RiderEntity;

public interface RiderRepository extends JpaRepository<RiderEntity, Integer>{

}
