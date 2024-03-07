package com.example.demo.registration.exception;

import java.util.Date;

public class RegistrationException {

	
	private Date timestamp;
	
	private String message;
	
	private String details;

	public RegistrationException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationException(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
}