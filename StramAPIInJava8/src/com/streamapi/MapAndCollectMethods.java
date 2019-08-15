package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter method is using for to check the conditions.
 * map method is using for to convert one to another object type.
 * forEach method is using for printing purposes.
 * here forEach is a terminal operation.
 * collect method is convert or transforming  one object type to another object type and after converting it's return that object.  
 * here collect is a terminal operation.
 * **/
public class MapAndCollectMethods {

	public static void main(String args[]){
		
		// Creating a List
		List<String> listOfStrings = Arrays.asList("Sam", "Manasa", "Chandu", "Pandu");
		
		// Imperative Style
		System.out.println("Imperative Style");
		for(String name : listOfStrings){
			if(!name.equals("Chandu")){
				User user = new User(name);
				System.out.println(user);
			}
		}
		
		// Functional Style
		System.out.println("Functional Style Using Java 8");
		listOfStrings.stream()
			.filter(name -> !name.equals("Chandu"))
			.map(name -> new User(name))
			.forEach(name -> System.out.println(name));
		
		// Converting List of String to List of User Object
		System.out.println("Converting List of String to List of User Object");
		List<User> listOfUser = listOfStrings.stream()
			.filter(name -> !name.equals("Chandu"))
			.map(name -> new User(name))
			.collect(Collectors.toList());
		
		System.out.println("List of Users : "+ listOfUser);
		
		// Method Reference and Functional Style
		System.out.println("Method Reference and Functional Style");
		listOfStrings.stream()
			.filter(MapAndCollectMethods::isNotChandu)
			.map(User::new)
			.forEach(System.out::println);
		
		// Converting List of String to List of User Object
		// Method Reference and Functional Style
		System.out.println("Converting List of String to List of User Object using Method Reference and Functional Style");
		List<User> listOfUsersMRFS = listOfStrings.stream()
			.filter(MapAndCollectMethods::isNotChandu)
			.map(User::new)
			.collect(Collectors.toList());
		System.out.println("List of Users using Method Reference : "+ listOfUsersMRFS);
		
	}
	
	// isNotChandu method
	private static boolean isNotChandu(String name){
		return !name.equals("Chandu");
	}

// User Class
static class User{
	private String userName;
	private int age = 30;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + "]";
	}
	
}

	/**
	 * OUTPUT:-
	 * Imperative Style
		User [userName=Sam, age=30]
		User [userName=Manasa, age=30]
		User [userName=Pandu, age=30]
		Functional Style Using Java 8
		User [userName=Sam, age=30]
		User [userName=Manasa, age=30]
		User [userName=Pandu, age=30]
		Converting List of String to List of User Object
		List of Users : [User [userName=Sam, age=30], User [userName=Manasa, age=30], User [userName=Pandu, age=30]]
		Method Reference and Functional Style
		User [userName=Sam, age=30]
		User [userName=Manasa, age=30]
		User [userName=Pandu, age=30]
		Converting List of String to List of User Object using Method Reference and Functional Style
		List of Users using Method Reference : [User [userName=Sam, age=30], User [userName=Manasa, age=30], User [userName=Pandu, age=30]]
	 **/
}
