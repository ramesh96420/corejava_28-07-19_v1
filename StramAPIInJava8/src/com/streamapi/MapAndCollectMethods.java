package com.streamapi;

import java.util.Arrays;
import java.util.List;

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
		
		// Method Reference and Functional Style
		System.out.println("Method Reference and Functional Style");
		listOfStrings.stream()
			.filter(MapAndCollectMethods::isNotChandu)
			.map(User::new)
			.forEach(System.out::println);
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
		Method Reference and Functional Style
		User [userName=Sam, age=30]
		User [userName=Manasa, age=30]
		User [userName=Pandu, age=30]
	 **/
}
