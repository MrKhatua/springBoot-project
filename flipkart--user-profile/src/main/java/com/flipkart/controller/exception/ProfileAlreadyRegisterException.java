package com.flipkart.controller.exception;

public class ProfileAlreadyRegisterException extends RuntimeException{
	public ProfileAlreadyRegisterException(String _message){
		super(_message);
	}

}
