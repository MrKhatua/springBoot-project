package com.kodewala.dto;

import java.util.List;

import com.kodewala.entity.StudentEntity;

public class CollageRequest {
	private String collageName;
	private String collageLocation;
	private List<StudentRequest> students;
	
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
	public List<StudentRequest> getStudents() {
		return students;
	}
	public void setStudents(List<StudentRequest> students) {
		this.students = students;
	}
	
	
}
