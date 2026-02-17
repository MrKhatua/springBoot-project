package com.uber.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rider_management")
public class RiderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int riderId;
	private String riderName;
	private long riderPhone;
	private String riderEmail;
	private String riderCurrentLocation;
	public int getRiderId() {
		return riderId;
	}
	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}
	public String getRiderName() {
		return riderName;
	}
	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}
	public long getRiderPhone() {
		return riderPhone;
	}
	public void setRiderPhone(long riderPhone) {
		this.riderPhone = riderPhone;
	}
	public String getRiderEmail() {
		return riderEmail;
	}
	public void setRiderEmail(String riderEmail) {
		this.riderEmail = riderEmail;
	}
	public String getRiderCurrentLocation() {
		return riderCurrentLocation;
	}
	public void setRiderCurrentLocation(String riderCurrentLocation) {
		this.riderCurrentLocation = riderCurrentLocation;
	}
	
}
