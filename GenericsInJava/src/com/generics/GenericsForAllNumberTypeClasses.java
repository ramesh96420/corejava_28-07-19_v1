package com.generics;

import java.util.ArrayList;

import com.generics.bean.Employee;

/**
 * NumberTypeContainer class is Custom Generic type class. This
 * NumberTypeContainer class supporting only Number type classes The number type
 * classes mean which class is extend the Number class that is called Number
 * class. Examples are Integer, Double, Float.. This NumberTypeContainer class
 * 
 **/
class NumberTypeContainer<T extends Number> {

	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public void show() {
		System.out.println(value.getClass().getName());
	}
	
	public void demo(ArrayList<? extends T> obj){
		
	}
}

public class GenericsForAllNumberTypeClasses {

	public static void main(String args[]) {

		// Generic type is Integer
		NumberTypeContainer<Integer> integerType = new NumberTypeContainer<>();
		integerType.value = 10;
		integerType.show();
		
		integerType.demo(new ArrayList<Integer>());
		
		//integerType.demo(new ArrayList<Number>());	//This line is giving error

		// Generic type is Integer
		NumberTypeContainer<Integer> floatType = new NumberTypeContainer<>();
		floatType.value = 10;
		floatType.show();

		
		
	}

}
