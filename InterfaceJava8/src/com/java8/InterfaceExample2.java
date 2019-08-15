package com.java8;

// Interface Z
interface Z{
	
	/**
	 * NOTE:-
	 * when ever we can try to override the Object class methods in Interface then we get the error.
	 * Error is "A default method cannot override a method from java.lang.Object".
	 * we can check below code Line number is 12.
	 * **/
	default boolean equals(Object o){
		return true;
	}
}
public class InterfaceExample2 {

	public static void main(String args[]){
		
		InterfaceExample2 ie2 = new InterfaceExample2();
		ie2.equals(1);
	}
}
