package com.maphashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String args[]){
		
		Map<String, String> map = new HashMap<>();
		map.put("ceo", "Ramesh");
		map.put("actor", "Charan");
		map.put("myName", "ABC");
		map.put("actor", "Zebra");
		
		System.out.println(map);
		Set<String> keys = map.keySet();	//keySet() method containing total set of key values.
		for(String key : keys){
			System.out.println(key + " " + map.get(key));
		}
	}
	
	/**
	 * OutPut:-
	 * {actor=Zebra, myName=ABC, ceo=Ramesh}
		actor Zebra
		myName ABC
		ceo Ramesh
	 **/

}
