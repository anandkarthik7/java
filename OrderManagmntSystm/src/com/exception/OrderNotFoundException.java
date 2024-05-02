package com.exception;

public class OrderNotFoundException extends Exception{
	private static final long serialVersionUID = 7486017673433370575L;
	private String message;

	public OrderNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
}
