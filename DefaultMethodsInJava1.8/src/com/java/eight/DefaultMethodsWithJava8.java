package com.java.eight;

// RBI Interface
interface RBI{
	void deposit();
	void withDraw();
	
	// New Rule Of RBI in 2017
	// Default methods with Adhar link
	public default void adharLink(){
		System.out.println("customer should link their adhar with the bank");
	}
	
	// Default methods with Minimum Balance
	public default void minBal(){
		System.out.println("Connect your bank to know the minimum balance that you need to mentain.");
	}
	
}

// SBI Bank
class SBI implements RBI{

	@Override
	public void deposit() {
		System.out.println("sbi deposit..");
	}

	@Override
	public void withDraw() {
		System.out.println("sbi withdraw..");
	}
	
	@Override
	public void adharLink() {
		System.out.println("your adhar has been linked with sbi bank");
	}
	
	@Override
	public void minBal() {
		System.out.println("minimum balance you need to maintain in your account.");
	}
}

// Axis Bank
class Axis implements RBI{

	@Override
	public void deposit() {
		System.out.println("axis deposit..");
	}

	@Override
	public void withDraw() {
		System.out.println("axis withdraw..");
	}
	
}

// Main Class
public class DefaultMethodsWithJava8 {

	public static void main(String args[]){
		// SBI Bank
		RBI sbiBank = new SBI();
		sbiBank.deposit();		//sbi deposit..
		sbiBank.withDraw();		//sbi withdraw..
		
		// New Rule of RBI in SBI Bank in 2017
		sbiBank.adharLink();		//your adhar has been linked with sbi bank
		sbiBank.minBal();			//minimum balance you need to maintain in your account.
		
		// Axis Bank
		RBI axisBank = new Axis();
		axisBank.deposit();			//axis deposit..
		axisBank.withDraw();		//axis withdraw..
		
		// New Rule of RBI in SBI Bank in 2017
		axisBank.adharLink();		//customer should link their adhar with the bank
		axisBank.minBal();			//Connect your bank to know the minimum balance that you need to mentain.
	}
	
	
}
