package com.trycatchfinally;

public class CustomerException extends Exception {

	private String message;
	public CustomerException(String msg){
		this.message = msg;
	}
	
	public String toString(){
		return message;
	}
}
