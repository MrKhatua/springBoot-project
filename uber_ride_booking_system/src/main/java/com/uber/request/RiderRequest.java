package com.uber.request;

public class RiderRequest {
	private String riderName;
	private long riderPhone;
	private String riderEmail;
	private String riderCurrentLocation;
	
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
