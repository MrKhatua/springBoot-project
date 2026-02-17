package com.kodewala.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Collage_Entity")
public class CollageEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CollageId;
	private String collageName;
	private 
}
