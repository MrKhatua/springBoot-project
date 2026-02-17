package com.kodewala.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodewala.entity.AuditEntity;

public interface AuditRepository extends JpaRepository<AuditEntity, Integer>{

}
