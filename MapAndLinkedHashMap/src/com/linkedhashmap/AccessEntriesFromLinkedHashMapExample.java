package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessEntriesFromLinkedHashMapExample {

	public static void main(String agrs[]){
		
		// Creating a LinkedHashMap
		Map<Integer, String> customerIdNameMapping = new LinkedHashMap<>();
		
		// Adding key-value pairs in LinkedHashMap
		customerIdNameMapping.put(101, "A");
		customerIdNameMapping.put(105, "B");
		customerIdNameMapping.put(104, "C");
		customerIdNameMapping.put(106, "D");
		customerIdNameMapping.put(107, "E");
		customerIdNameMapping.put(null, "I");
		customerIdNameMapping.put(null, "J");
		
		System.out.println(customerIdNameMapping);
		
		// Check if a key exists in the LinkedHashMap
		int id = 104;
		if(customerIdNameMapping.containsKey(id)){
			System.out.println("Found the customer with id " + id +" : "+customerIdNameMapping.get(id));
		}else{
			System.out.println("Customer id "+ id + " does not exist");
		}
		
		// Check if a value exists in the LinkedHashMap
		String name = "E";
		if(customerIdNameMapping.containsValue(name)){
			System.out.println("A customer named " + name + " exist in the map");
		}else{
			System.out.println("No customer found with name " + name + " in the map");
		}
		
		// Change the value associated with an existing key
		id = 1004;
		customerIdNameMapping.put(id, "Box");
		
		System.out.println("Changed the name of customer with id " + id + ", New mapping : " + customerIdNameMapping);
		
		/**
		 * OutPut:-
		 * {101=A, 105=B, 104=C, 106=D, 107=E, null=J}
			Found the customer with id 104 : C
			A customer named E exist in the map
			Changed the name of customer with id 1004, New mapping : {101=A, 105=B, 104=C, 106=D, 107=E, null=J, 1004=Box}
		 **/
	}
}
