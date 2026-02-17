package com.uber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.DriverEntity;
import com.uber.repository.DriverRepository;
import com.uber.request.DriverRequest;

@Service
public class DriverService {
	@Autowired
	private DriverRepository driverRepository;
	public String createDriverMgnt(DriverRequest driverRequest) {
		DriverEntity driverEntity = new DriverEntity();
		
		driverEntity.setDriverName(driverRequest.getDriverName());
		driverEntity.setDriverPhone(driverRequest.getDriverPhone());
		driverEntity.setVehicleNo(driverRequest.getVehicleNo());
		driverEntity.setAvailability(driverRequest.getAvailability());
		driverEntity.setCurrentLocation(driverRequest.getCurrentLocation());
		
		driverEntity = driverRepository.save(driverEntity);
		return "Driver Registration Succesfully. Id : "+ driverEntity.getDriverId();
	}
	
	public String updateAva(DriverRequest driverRequest,int driverId) {
		
		DriverEntity driverEntity = driverRepository.findById(driverId).orElseThrow(() -> new IllegalArgumentException("Not driver present"));
		driverEntity.setAvailability(driverRequest.getAvailability());
		driverRepository.save(driverEntity);
		return "Updated Availability. Of id : "+driverEntity.getDriverId();
	}
	
	public List<DriverEntity> showAllDriver(){
		return driverRepository.findAll();
	}
	
	public String deleteDriverMgnt(int driverId) {
		driverRepository.findById(driverId).orElseThrow(() -> new IllegalArgumentException("Not driver present"));
		driverRepository.deleteById(driverId);
		return "Deleted Successfully of Id : "+driverId;
	}
}
