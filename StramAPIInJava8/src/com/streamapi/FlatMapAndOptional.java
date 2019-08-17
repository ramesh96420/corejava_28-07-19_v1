package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * flatMap is using for to convert one type stream to another type stream.
 * Optional is a wrapper class is used to avoid the NullPointException.
 * **/
public class FlatMapAndOptional {

	public static void main(String args[]){
		
		List<User> listOfUsers =  Arrays.asList(
				new User("Ramesh",20, Arrays.asList("1", "2")),
				new User("Chandu", 25, Arrays.asList("3", "5", "2")),
				new User("Pandu", 35, Arrays.asList("6", "8", "9"))
			);
		
		// Using flatMap and Optional class
		System.out.println("Using flatMap and Optional class");
		Optional<String> stringOptional = listOfUsers.stream()
				.map(user -> user.getPhoneNum().stream())
				.flatMap(phoneNum -> phoneNum.filter(phonNo -> phonNo.equals("3")))
				.findAny();
		
		//stringOptional.ifPresent(phNo -> System.out.println(phNo));
		stringOptional.ifPresent(System.out::println);
		
		// Phone Number is not available than we can use the Optional
		System.out.println("Phone Number is not available than we can use the Optional");
		System.out.println("Optional is return any thing here we avoid the NullPointerException.");
		Optional<String> optional = listOfUsers.stream()
				.map(user -> user.getPhoneNum().stream())
				.flatMap(phonNumber -> phonNumber.filter(phonNo -> phonNo.equals("10")))
				.findAny();
		optional.ifPresent(System.out::println);
		
		/**
		 * OUTPUT:-
		 * Using flatMap and Optional class
			3
			Phone Number is not available than we can use the Optional
			Optional is return any thing here we avoid the NullPointerException.
		 **/
				
	}
	
// User Class
static class User{
	private String name;
	private int age = 30;
	private List<String> phoneNum;
	public User(String name, int age, List<String> phoneNum) {
		this.name = name;
		this.age = age;
		this.phoneNum = phoneNum;
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
	public List<String> getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	}
	
			
}
}
