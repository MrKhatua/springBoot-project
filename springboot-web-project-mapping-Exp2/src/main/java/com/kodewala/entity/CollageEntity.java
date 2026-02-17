package com.kodewala.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Collage_DB")
public class CollageEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collageId;
	private String collageName;
	private String collageLocation;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "collageId")
	private List<StudentEntity> students;
	
	public int getCollageId() {
		return collageId;
	}
	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public String getCollageLocation() {
		return collageLocation;
	}
	public void setCollageLocation(String collageLocation) {
		this.collageLocation = collageLocation;
	}
	public List<StudentEntity> getStudents() {
		return students;
	}
	public void setStudents(List<StudentEntity> students) {
		this.students = students;
	}
}