package com.maphashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {

	public static void main(String args[]){
		
		// Creating a HashMap
		Map<String, String> countryISOCodeMapping  = new HashMap<>();
		
		// Adding key-value pairs in HashMap
		countryISOCodeMapping.put("US", "U120");
		countryISOCodeMapping.put("Australia", "AS123");
		countryISOCodeMapping.put("India", "IN122");
		countryISOCodeMapping.put("UP", "UP355");
		
		// HashMap's entry set
		Set<Map.Entry<String,String>> countryISOCodeEntries = countryISOCodeMapping.entrySet();
		System.out.println("countryISOCode entries : " + countryISOCodeEntries);
		
		// HashMap's key set
		Set<String> countries = countryISOCodeMapping.keySet();
		System.out.println("countries : " + countries);
		
		// HashMap's value set
		Collection<String> isoCodes  = countryISOCodeMapping.values();
		System.out.println("isoCodes : " + isoCodes);
		
		/**
		 * OutPut:-
		 * countryISOCode entries : [UP=UP355, Australia=AS123, US=U120, India=IN122]
			countries : [UP, Australia, US, India]
			isoCodes : [UP355, AS123, U120, IN122]
		 **/
		
	}
}
