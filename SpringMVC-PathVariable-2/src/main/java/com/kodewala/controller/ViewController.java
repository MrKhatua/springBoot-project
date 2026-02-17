package com.kodewala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/viewPage/{id}")
	public String showPage(@PathVariable("id") int ide) {
		System.out.println("ViewController.showPage()  id: "+ide );
		return "page";
	}
}
