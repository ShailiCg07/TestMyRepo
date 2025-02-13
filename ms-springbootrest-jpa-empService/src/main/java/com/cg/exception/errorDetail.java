package com.cg.exception;

import java.sql.Date;

public class errorDetail {
	private Date TIMESTAMP;
	private String message;
	private String Details;
	public errorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}
	public String getMessage() {
		return message;
	}
	public String getDetails() {
		return Details;
	}
	public errorDetail(Date TIMESTAMP, String message, String details) {
		super();
		TIMESTAMP = TIMESTAMP;
		this.message = message;
		Details = details;
	}
	@Override
	public String toString() {
		return "errorDetail [TIMESTAMP=" + TIMESTAMP + ", message=" + message + ", Details=" + Details + "]";
	}
	
	
}
