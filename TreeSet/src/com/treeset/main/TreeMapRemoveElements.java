package com.treeset.main;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRemoveElements {

	public static void main(String[] args) {
		
		// Creating a TreeMap
		Map<Integer, String> orderOfTreeMap = new TreeMap<>();
		
		// Adding key-value pairs in TreeMap
		orderOfTreeMap.put(1, "A1");
		orderOfTreeMap.put(3, "B1");
		orderOfTreeMap.put(5, "B1");
		orderOfTreeMap.put(4, "B1");
		orderOfTreeMap.put(6, "B1");
		orderOfTreeMap.put(7, "B1");
		orderOfTreeMap.put(8, "B1");
		
		System.out.println(orderOfTreeMap);
		
		// Remove the Entry based on Key
		Integer id = 6;
		String isRemoving = orderOfTreeMap.remove(id);
		
		System.out.println(isRemoving);
		System.out.println(orderOfTreeMap);
		

	}

}
