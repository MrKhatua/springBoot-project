package com.flipcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {
	@RequestMapping("/viewPage/{id}")
	public String showStatus(@PathVariable("id") int id) {
		System.out.println("Status Controller received path variable : "+id);
		return "statusPage";
	}
}
