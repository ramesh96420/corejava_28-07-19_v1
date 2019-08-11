package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CreateLinkedHashMapExample {

	public static void main(String args[]){
		
		// Creating a LinkedHashMap
		Map<String, Integer> wordNumberMapping = new LinkedHashMap<>();
		
		// Adding key-value pairs in LinkedHashMap
		wordNumberMapping.put("One", 1);
		wordNumberMapping.put("Two", 2);
		wordNumberMapping.put("Three", 3);
		wordNumberMapping.put("Four", 4);
		
		// Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
		wordNumberMapping.putIfAbsent("Five", 5);
		
		System.out.println(wordNumberMapping);
	}
}
