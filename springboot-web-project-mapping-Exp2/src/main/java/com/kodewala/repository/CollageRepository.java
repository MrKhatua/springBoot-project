package com.kodewala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.entity.CollageEntity;

@Repository
public interface CollageRepository extends JpaRepository<CollageEntity, Integer>{
	//List<CollageEntity> findAllWithStudents();
}
