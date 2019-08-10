package com.java.seven;

// RBI Interface
interface RBI{
	void deposit();
	void withDraw();
}

// New Rule of RBI in 2017
interface RBI2017Rule extends RBI{
	void adharLink();
	void minimumBalance();
}

// SBI Bank Class
class SBI implements RBI{

	@Override
	public void deposit() {
		System.out.println("sbi deposit..");
	}

	@Override
	public void withDraw() {
		System.out.println("sbi withdraw..");
	}
	
}

// New RBI Rule in SBI Bank in 2017
class SBI2_0 extends SBI implements RBI2017Rule{

	@Override
	public void adharLink() {
		System.out.println("sbi aahar link..");
	}

	@Override
	public void minimumBalance() {
		System.out.println("sbi minimum balance..");
	}
	
}

// Axis Bank Class
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

// New RBI Rule in Axis Bank in 2017
class Axis2_0 extends Axis implements RBI2017Rule{

	@Override
	public void adharLink() {
		System.out.println("axis aahar deposit..");
	}

	@Override
	public void minimumBalance() {
		System.out.println("axis minimum deposit..");
	}
	
	
}

// PNB Bank Class
class PNB implements RBI{
	
	@Override
	public void deposit() {
		System.out.println("pnb deposit..");
	}

	@Override
	public void withDraw() {
		System.out.println("pnb withdraw..");
	}
}

// New RBI Rule in PNG Bank in 2017
class PNG2_0 extends PNB implements RBI2017Rule{

	@Override
	public void adharLink() {
		System.out.println("pnb aahar deposit..");
	}

	@Override
	public void minimumBalance() {
		System.out.println("pnb minimum deposit..");
	}
	
}

// Main Class
public class BeforJava8Implementation {

	public static void main(String args[]){
		
		// SBI Bank
		RBI sbiBank = new SBI();
		sbiBank.deposit();		//sbi deposit..
		sbiBank.withDraw();		//sbi withdraw..
		
		// New RBI Rule in SBI Bank in 2017
		RBI2017Rule rbiNewRulesInSbi = new SBI2_0();
		rbiNewRulesInSbi.adharLink();			//sbi adhar link..
		rbiNewRulesInSbi.minimumBalance();		//sbi minimum balance..
		
		// Axis Bank
		RBI axisBank = new Axis();
		axisBank.deposit();			//axis deposit..
		axisBank.withDraw();		//axis withdraw..
		
		// New RBI Rule in Axis Bank in 2017
		RBI2017Rule rbiNewRulesInAxis = new Axis2_0();
		rbiNewRulesInAxis.adharLink();			//axis aahar deposit..
		rbiNewRulesInAxis.minimumBalance();		//axis minimum deposit..
		
		// PNB Bank
		RBI pnbBank = new PNB();
		pnbBank.deposit();		//pnb deposit..
		pnbBank.withDraw();		//pnb withdraw..
		
		// New RBI Rule in PNB Bank in 2017
		RBI2017Rule rbiNewRulesInPng = new PNG2_0();
		rbiNewRulesInPng.adharLink();			//pnb aahar deposit..
		rbiNewRulesInPng.minimumBalance();		//pnb minimum deposit..
			
	}
}
