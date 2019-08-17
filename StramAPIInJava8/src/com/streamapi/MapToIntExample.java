package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapToIntExample {

	public static void main(String args[]){
		
		// Creating a List
		List<String> listOfString = Arrays.asList("Ramesh", "Sam", "Pandu", "Laddu");
		
		// Using Function Style
		System.out.println("Using Function Style to Print the List Of Names");
		listOfString.stream().filter(name -> !name.equals("Sam")).forEach(name -> System.out.println(name));
		
		// Using Method Reference and Functional Style
		System.out.println("Using Method Reference and Functional Style to Print the List Of Names");
		listOfString.stream().filter(MapToIntExample::isNotSam).forEach(System.out::println);
		
		// Using Function Style
		System.out.println("Using Function Style to convert List Of Names into User Object type");
		List<User> user = listOfString.stream()
				.filter(name -> !name.equals("Pandu"))
				.map(name -> new User(name))
				.collect(Collectors.toList());
		System.out.println(user);
		
		// Using Method Reference and Functional Style
		System.out.println("Using Method Reference and Functional Style to convert List Of Names into User Object type");
		List<User> listOfUser = listOfString.stream()
				.filter(MapToIntExample::isNotSam)
				.map(User::new)
				.collect(Collectors.toList());
		System.out.println(listOfUser);
		
		// MapToInt function inside the Stream 
		System.out.println("MapToInt function inside the Stream ");
		int sum = listOfUser.stream().mapToInt(u -> u.getAge()).sum();
		System.out.println(sum);
		
		// MapToInt function inside the Stream with Method Reference
		System.out.println("MapToInt function inside the Stream with Method Reference");
		int sum1 = listOfUser.stream().mapToInt(User::getAge).sum();
		System.out.println(sum1);
		
		
		
		/**
		 * OUTPUT:-
		 * Using Function Style to Print the List Of Names
			Ramesh
			Pandu
			Laddu
			Using Method Reference and Functional Style to Print the List Of Names
			Ramesh
			Pandu
			Laddu
			Using Function Style to convert List Of Names into User Object type
			[User [name=Ramesh, age=30], User [name=Sam, age=30], User [name=Laddu, age=30]]
			Using Method Reference and Functional Style to convert List Of Names into User Object type
			[User [name=Ramesh, age=30], User [name=Pandu, age=30], User [name=Laddu, age=30]]
			MapToInt function inside the Stream 
			90
			MapToInt function inside the Stream with Method Reference
			90
		 **/
		
	}
	
	private static boolean isNotSam(String name){
		return !name.equals("Sam");
	}
	
// User Class
static class User{
	private String name;
	private int age = 30;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
}
