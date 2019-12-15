package com.exception.handler.exceptionHandler.controller;

public class NewException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String newMessage;
	
	public NewException(String newMessage, String errorCode, String causing) {
		super(newMessage);
		this.newMessage = newMessage;
		this.errorCode = errorCode;
		this.causing = causing;
	}

	private String errorCode;
	private String causing;
	
	public String getCausing() {
		return causing;
	}
	public void setCausing(String causing) {
		this.causing = causing;
	}
	public String getNewMessage() {
		return newMessage;
	}
	public void setNewMessage(String newMessage) {
		this.newMessage = newMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
