package com.uber.request;

public class DriverRequest {
	private String driverName;
	private long driverPhone;
	private String vehicleNo;
	private String availability;
	private String currentLocation;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public long getDriverPhone() {
		return driverPhone;
	}
	public void setDriverPhone(long driverPhone) {
		this.driverPhone = driverPhone;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getCurrentLocation() {
		return currentLocation;
	}
	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}
}
