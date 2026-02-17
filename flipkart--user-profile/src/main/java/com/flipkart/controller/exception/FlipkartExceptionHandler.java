package com.flipkart.controller.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FlipkartExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public String handleException(Exception e, Model model) {
		model.addAttribute("errorMessage","Unable to process your request");
		return "error";	
	}
	@ExceptionHandler(ProfileAlreadyRegisterException.class)
	public String handleException(ProfileAlreadyRegisterException e, Model model) {
		model.addAttribute("errorMessage"," Profile is already registerd"+e.getMessage());
		return "error";
	}
}
