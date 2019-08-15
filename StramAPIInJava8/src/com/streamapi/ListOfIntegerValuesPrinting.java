package com.streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOfIntegerValuesPrinting {

	public static void main(String args[]){
		
		/* Below all implementations are External Iterations. */
		// Creating the List 
		List<Integer> listOfInterger = Arrays.asList(1,2,3,4,5,6);
		
		// Using for loop method
		System.out.println("Using for loop");
		for(int i=0; i<6; i++){
			System.out.println(listOfInterger.get(i));
		}
		
		// Using Iterator interface
		System.out.println("Using Iterator Interface");
		Iterator<Integer> iterator = listOfInterger.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		// Using Enhance for loop
		System.out.println("Using Enhance for loop");
		for(int value : listOfInterger){
			System.out.println(value);
		}
		
		/**
		 * OUTPUT:-
		 * Using for loop
			1
			2
			3
			4
			5
			6
			Using Iterator Interface
			1
			2
			3
			4
			5
			6
			Using Enhance for loop
			1
			2
			3
			4
			5
			6
		 **/
		
		//Using Java 8 feature forEach() method
		System.out.println("Using Java 8 feature forEach() method");
		listOfInterger.forEach(i -> System.out.println(i));
		
		/**
		 * OUTPUT:-
		 * Using Java 8 feature forEach() method
			1
			2
			3
			4
			5
			6
		 **/
	}
}
