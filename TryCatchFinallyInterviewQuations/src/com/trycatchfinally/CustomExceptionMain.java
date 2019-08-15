package com.trycatchfinally;

public class CustomExceptionMain {

	public static void main(String args[]){
		try{
			
			throw new CustomerException("Invalid Values are passing.");
		}catch(CustomerException ce){
			System.out.println("Custom Exception is : "+ce);
		}
	}
}
