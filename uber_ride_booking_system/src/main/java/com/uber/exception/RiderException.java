package com.uber.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RiderException {
	@ExceptionHandler(RiderNotFoundException.class)
	public String handleRiderNotFound(RiderNotFoundException ex) {
		return ex.getMessage();
		
	}
}
