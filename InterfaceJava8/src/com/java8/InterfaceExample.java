package com.java8;

// Interface I
interface I{
	
	void add();
	default void show(){
		System.out.println("Interface I");
	}
}

// Interface J
interface J{
	void minus();
	default void show(){
		System.out.println("Interface J");
	}
}

// Main class
public class InterfaceExample implements I, J{

	public static void main(String args[]){
		
		InterfaceExample ie = new InterfaceExample();
		ie.minus();
		ie.add();
		ie.show();
	}
	
	@Override
	public void minus() {
		
	}

	@Override
	public void add() {
		
	}

	/**
	 * NOTE:- This show method should be override, other wise it's giving error.
		why because show method containing both I, J interface 
		so we should be override.
	 **/
	@Override
	public void show() {
		
		// It will call J interface default method.
		J.super.show();
		
		// It will call I interface default method.
		I.super.show();
		
		System.out.println("This show method should be ovverride, other wise it's giving error.");
	}
	
	/**
	 * OUTPUT:-
	 * Interface J
		Interface I
		This show method should be ovverride, other wise it's giving error.
	 **/

}
