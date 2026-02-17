package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.entity.AmazonEntity;

public interface AmazonRepository extends JpaRepository<AmazonEntity, Integer> {

}
