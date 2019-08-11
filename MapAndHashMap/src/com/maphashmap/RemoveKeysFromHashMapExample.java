package com.maphashmap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKeysFromHashMapExample {

	public static void main(String args[]){
		
		// Create a HashMap
		Map<String, String> husbandWifeMapping = new HashMap<>();
		
		// Adding key-value pairs in HashMap
		husbandWifeMapping.put("Ramesh", "Kavitha");
		husbandWifeMapping.put("Charan", "Janavi");
		husbandWifeMapping.put("Arun", "Manasa");
		husbandWifeMapping.put("Pandu", "Lakky");
		
		// Remove a key from the HashMap
		// Ex - Unfortunately, Charan got divorced. Let's remove him from the mapping
		String husband = "Charan";
		String wife = husbandWifeMapping.remove(husband);
		
		System.out.println("Couple (" + husband + " => " + wife + ") got divorced");
		System.out.println("New Mapping : " + husbandWifeMapping);
		
		// Remove a key from the HashMap only if it is mapped to the given value
		// Ex - Divorce "Arun" only if He is married to "Manasa"
		boolean isRemoved = husbandWifeMapping.remove("Arun", "Manasa");
		
		System.out.println("Did Arun get removed from the mapping? : " + isRemoved);
		
		// remove() returns null if the mapping was not found for the supplied key
		wife = husbandWifeMapping.remove("Devid");
		if(wife == null){
			System.out.println("Looks like David is not married to anyone");
		}else{
			System.out.println("Removed David and his wife from the mapping");
		}
		
		/**
		 * OutPut:-
		 * Couple (Charan => Janavi) got divorced
			New Mapping : {Arun=Manasa, Ramesh=Kavitha, Pandu=Lakky}
			Did Arun get removed from the mapping? : true
			Looks like David is not married to anyone
		 **/
	}
}
