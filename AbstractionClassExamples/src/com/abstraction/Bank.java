package com.abstraction;

// RBI Bank Class
abstract class RBIBank {

	public void deposit() {
		System.out.println("RBIBank Deposit method");
	}

	public void withDraw() {
		System.out.println("RBIBank WithDraw method");
	}

	abstract void rateOfInterest();
}

// HDFC Bank Class
class HDFC extends RBIBank {

	@Override
	void rateOfInterest() {
		System.out.println("HDFC Rate of intrest is 10.99%");
	}

}

// IDBC Bank Class
class IDBC extends RBIBank {

	@Override
	void rateOfInterest() {
		System.out.println("IDBC Rate of intrest is 14.25%");
	}
}

// Main Bank Class
public class Bank {

	public static void main(String args[]){
		
		// Crating a HDFC Bank
		System.out.println("HDFC Bank");
		HDFC hdfcBank = new HDFC();
		hdfcBank.deposit();
		hdfcBank.withDraw();
		hdfcBank.rateOfInterest();
		
		
		// Creating a IDBC Bank
		System.out.println("IDBC Bank");
		IDBC idbcBank = new IDBC();
		idbcBank.deposit();
		idbcBank.withDraw();
		idbcBank.rateOfInterest();
		
	}
	
	/**
	 * OUTPUT:-
	 * HDFC Bank
		RBIBank Deposit method
		RBIBank WithDraw method
		HDFC Rate of intrest is 10.99%
		IDBC Bank
		RBIBank Deposit method
		RBIBank WithDraw method
		IDBC Rate of intrest is 14.25%
	 **/
}
