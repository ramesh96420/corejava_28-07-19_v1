package com.maphashmap;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {

	public static void main(String args[]){
		
		// Creating a HashMap with UserName and CityName
		Map<String, String> userCityMapping = new HashMap<>();
		
		// Adding key-value pairs in HashMap
		userCityMapping.put("John", "New Yark");
		userCityMapping.put("Ramesh", "India");
		userCityMapping.put("Janavi", "US");
		userCityMapping.put("Steve", "London");
		
		// Find the Size of HashMap
		System.out.println("HashMap Size "+userCityMapping.size());
		
		String userName = "Steve";
		
		// Check if a key is exists in the HashMap
		if(userCityMapping.containsKey(userName)){
			String cityName = userCityMapping.get(userName);
			System.out.println(userName +" "+ cityName);
		}else{
			System.out.println("City details not found for user "+userName);
		}
		
		String cityName = "US";
		// Check if a value is exists in the HashMap
		if(userCityMapping.containsValue(cityName)){
			System.out.println("There is a user in the userCityMapping who lives in US");
		}else{
			System.out.println("There is a no user in the userCityMapping who lives in US");
		}
		
		// Modify the value assigned to an existing key
		userCityMapping.put(userName, "California");
		 System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);

	}
}
