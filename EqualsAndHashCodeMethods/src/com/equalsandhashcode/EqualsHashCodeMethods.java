package com.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeMethods {

	public static void main(String[] args) {

		User emp1 = new User(1);
		User emp2 = new User(1);
		
		Map<User, String> map = new HashMap<>();
		map.put(emp1, "Employee");
		map.put(emp1, "Employee");
		
		System.out.println(map.size());
		
		Integer i = new Integer(1);
		Integer i1 = new Integer(1);
		
		Map<Integer, String> mapInt = new HashMap<>();
		mapInt.put(i, "Employee");
		mapInt.put(i1, "Employee");
		
		System.out.println(mapInt.size());
		
	}

}
class User{
	
	private int id;
	
	public User(int id){
		this.id = id;
	}
}
