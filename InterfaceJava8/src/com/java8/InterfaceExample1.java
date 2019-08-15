package com.java8;

// Interface X
interface X{
	void add();
	default void show(){
		System.out.println("Interface I");
	}
}

// Interface Y
interface Y{
	void add();
	default void show(){
		System.out.println("Interface J");
	}
}

// Class A
class A{
	public void show(){
		System.out.println("Class A");
	}
}

/**
 * NOTE:-
 * Class is more power full compare with Interface.
 * Normal methods are more power full compare with default methods.
 * So below example will call show() method in A class.
 * **/
public class InterfaceExample1 extends A implements X,Y{

	public static void main(String args[]){
		
		// Creating a InterfaceExample1 Object 
		InterfaceExample1 ie1 = new InterfaceExample1();
		ie1.add();
		ie1.show();
	}
	
	@Override
	public void add() {
		
	}

	/**
	 * OUTPUT:-
	 * Class A
	 **/
}
