package com.uber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.entity.DriverEntity;
import com.uber.request.DriverRequest;
import com.uber.service.DriverService;

@RestController
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	private DriverService driverService;
	@PostMapping
	public String createDriver(@RequestBody DriverRequest driverRequest) {
		String response = driverService.createDriverMgnt(driverRequest);
	    return response;
	}
	@PutMapping("/update/{driverId}")
	public String updateDriverAva(@RequestBody DriverRequest driverRequest, @PathVariable int driverId) {
		return driverService.updateAva(driverRequest, driverId);
	}
	@GetMapping("/showDriver")
	public List<DriverEntity> showAllDriver(){
		return driverService.showAllDriver();
	}
	@DeleteMapping("/delete/{driverId}")
	public String deleteDriver(@PathVariable int driverId) {
		return driverService.deleteDriverMgnt(driverId);
	}
}
