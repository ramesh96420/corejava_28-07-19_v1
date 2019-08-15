package com.streamapi;

import java.util.Arrays;
import java.util.List;

/**
 * filter method is using for to check the conditions.
 * map method is using for to convert one to another object type.
 * forEach method is using for printing purposes. 
 * **/
public class FilterAndForEachMethods {

	public static void main(String args[]){
		
		// Creating A List 
		List<String> listOfStrings = Arrays.asList("Ramesh", "Nirmala", "Pandu", "XYZ", "Rani");
		
		// Imperative Style
		System.out.println("Imperative Style");
		for(String name : listOfStrings){
			if(!name.equals("XYZ")){
				System.out.println(name);
			}
		}
		
		/*Consumer and Predicate both are Functional Interface */
		// Functional Style using Java 8
		System.out.println("Functional Style using Java 8");
		listOfStrings.stream()
			.filter(name -> !name.equals("XYZ"))			// filter() is basically Predicate it's return true or false.
			.forEach(name -> System.out.println(name));		// forEach() is basically Consumer	it's don't return any thing.
		
		
		// Using Method Reference and Functional Style in java 8
		System.out.println("Using Method Reference and Functional Style in java 8");
		listOfStrings.stream()
			.filter(FilterAndForEachMethods::isNotXYZ)		// This line is method reference
			.forEach(System.out::println);					// This line is method reference
		
	}

	private static boolean isNotXYZ(String name) {
		return !name.equals("XYZ");
	}
	
	/**
	 * OUTPUT:-
	 * Imperative Style
		Ramesh
		Nirmala
		Pandu
		Rani
		Functional Style using Java 8
		Ramesh
		Nirmala
		Pandu
		Rani
		Using Method Reference and Functional Style in java 8
		Ramesh
		Nirmala
		Pandu
		Rani
	 **/
}
