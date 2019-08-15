package com.maplinkedhashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx1 {

	public static void main(String[] args) {

		// LinkedHashMap
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("A1", 10);
		map.put("B1", 41);
		map.put("C1", 52);
		map.put("D1", 11);
		map.put("E1", 52);
		map.put("F1", 63);
		map.put("A2", 20);
		map.put("B2", 31);
		map.put("C2", 85);
		map.put("D2", 44);
		map.put("E2", 58);
		map.put("F2", 13);
		
		// Part One
		// Set		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		// Display the Map object data
		for(Map.Entry<String, Integer> entry : entries){
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		System.out.println();
		
		// Part Two
		// To Display the data in reverse order
		List<String> list = new ArrayList<>(map.keySet());
		Collections.reverse(list);
		
		// To Print the keys in reverse order
		for(String key : list){
			System.out.println(key);
		}
		
		/**
		 * OutPut:-
		 * A1 10
			B1 41
			C1 52
			D1 11
			E1 52
			F1 63
			A2 20
			B2 31
			C2 85
			D2 44
			E2 58
			F2 13
			
			F2
			E2
			D2
			C2
			B2
			A2
			F1
			E1
			D1
			C1
			B1
			A1
		 **/
		
	}

}
