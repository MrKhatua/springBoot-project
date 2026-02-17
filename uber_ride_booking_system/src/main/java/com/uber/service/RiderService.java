package com.uber.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.entity.RiderEntity;
import com.uber.exception.RiderNotFoundException;
import com.uber.repository.RiderRepository;
import com.uber.request.RiderRequest;

@Service
public class RiderService {
	@Autowired
	RiderRepository riderRepository;
	public String createRiderdata(RiderRequest riderRequest) {
		RiderEntity entity = new RiderEntity();
		
		entity.setRiderName(riderRequest.getRiderName());
		entity.setRiderEmail(riderRequest.getRiderEmail());
		entity.setRiderPhone(riderRequest.getRiderPhone());
		entity.setRiderCurrentLocation(riderRequest.getRiderCurrentLocation());
		
		entity = riderRepository.save(entity);
		return "Successfully Rider Account is Created. Rider Id is : "+entity.getRiderId();
	}
	
	public RiderRequest giveRiderDetailsById(int riderId) {
		RiderRequest request = new RiderRequest();
		
		RiderEntity idData = riderRepository.findById(riderId).orElseThrow(() -> new RiderNotFoundException("Rider Not Found with id : "+riderId));
		
		request.setRiderName(idData.getRiderName());
		request.setRiderEmail(idData.getRiderEmail());
		request.setRiderPhone(idData.getRiderPhone());
		request.setRiderCurrentLocation(idData.getRiderCurrentLocation());
		
		return request;
	}
	
	public String updateRiderData(RiderRequest riderRequest,int riderId) {
		
		RiderEntity riderEntity = riderRepository.findById(riderId).orElseThrow(() -> new RiderNotFoundException("Rider Not Present with id : "+riderId));
		
		riderEntity.setRiderName(riderRequest.getRiderName());
		riderEntity.setRiderEmail(riderRequest.getRiderEmail());
		riderEntity.setRiderPhone(riderRequest.getRiderPhone());
		riderEntity.setRiderCurrentLocation(riderRequest.getRiderCurrentLocation());
		
		riderEntity = riderRepository.save(riderEntity);
		return "Successfully Rider Profile Updated Of id : "+riderId;
	}
	
	public String deleteRiderData(int riderId) {
		riderRepository.findById(riderId).orElseThrow(() -> new RiderNotFoundException("Rider Not Present with id : "+riderId));
		riderRepository.deleteById(riderId);
		return "Rider deleted Successfully. With Id : "+riderId;
	}
}
