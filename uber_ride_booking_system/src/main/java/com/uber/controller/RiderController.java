package com.uber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.request.RiderRequest;
import com.uber.service.RiderService;

@RestController
@RequestMapping("/uber")
public class RiderController {
	@Autowired
	private RiderService riderService;
	@PostMapping
	public String createRiderMgnt(@RequestBody RiderRequest riderRequest) {
		String saveData =  riderService.createRiderdata(riderRequest);
		return saveData;
	}
	@GetMapping("/showRider/{riderId}")
	public RiderRequest showRiderDetailsById(@PathVariable int riderId) {
		RiderRequest showRider = riderService.giveRiderDetailsById(riderId);
		return showRider;
	}
	@PutMapping("/update/{riderId}")
	public String updateRiderData(@RequestBody RiderRequest riderRequest,@PathVariable int riderId) {
		String response = riderService.updateRiderData(riderRequest, riderId);
		return response;	
	}
	@DeleteMapping("/delete/{riderId}")
	public String deleteRider(@PathVariable int riderId) {
		return riderService.deleteRiderData(riderId);
	}
}
