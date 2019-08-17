package com.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PeekAndSkipOperations {

	public static void main(String args[]){
		
		// Using peek operation to display the values
		System.out.println("Using peek operation to display the values");
		List<String> stringValue = Stream.of("One", "Two", "Three")
		.filter(obj -> !obj.equals("One"))
		.peek(System.out::println)		//.peek(obj -> System.out.println(obj))
		.collect(Collectors.toList());
		
		/**
		 * OUTPUT:-
		 * Using peek operation to display the values
			Two
			Three
		 **/
		
		// Using skip operation to skipping for required values
		System.out.println("Using skip operation to skipping for required values");
		IntStream.of(1,23,4,5,6,8,9)
				.skip(2)
				.filter(i -> i>5)
				.forEach(System.out::println); 		//.forEach(i -> System.out.println());
		
		/**
		 * OUTPUT:- 
		 * Using skip operation to skipping for required values
			6
			8
			9
		 **/
	}
}
