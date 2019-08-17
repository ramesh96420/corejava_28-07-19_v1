package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameDisplyInOrderInterviewQuation {

	public static void main(String args[]){
		
		List<String> names = Arrays.asList("How are you?", "Namaste", "Hello", "Welcome to Youtube", "Hi", "Hello", "Namaste");
		
		List<String> listOfName = names.stream()
					.filter(name -> name.startsWith("H"))
					.map(name -> name.substring(2))
					.distinct()
					.sorted()
					.collect(Collectors.toList());
		System.out.println(listOfName);
		
		// Display Names Start with S charactor.
		System.out.println("Display Names Start with 'S' charactor.");
		List<String> name1 = Arrays.asList("Ramesh", "Sundar", "Chandu", "Sun", "Sam", "Sundar");
		List<String> displayStartWithS = name1.stream().filter(name -> name.startsWith("S"))
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(displayStartWithS);
		
		
		/**
		 * OUTPUT:-
		 * [, llo, w are you?]
			Display Names Start with 'S' charactor.
			[Sam, Sun, Sundar]
		 **/
		
	}
}
