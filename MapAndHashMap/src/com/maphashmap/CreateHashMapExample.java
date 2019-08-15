package com.maphashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String args[]){
		
		// Creating a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		
		// Adding key-value pairs to a HashMap.
		hashMap.put("One", 1);
		hashMap.put("Two", 2);
		hashMap.put("Three", 3);
		hashMap.put("Four", 4);
		
		// Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
		hashMap.putIfAbsent("Five", 5);
		
		Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
		
		// Display the HashMap values
		for(Map.Entry<String, Integer> entry: entries){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key +" "+ value);
		}
		
		/**
		 * OutPut:-
		 * Five 5
			One 1
			Four 4
			Two 2
			Three 3
		 **/
	}
}
