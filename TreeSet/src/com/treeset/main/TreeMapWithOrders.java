package com.treeset.main;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapWithOrders {

	public static void main(String args[]){
		
		NavigableMap<Integer, String> orderOfTreeMap = new TreeMap<>();
		orderOfTreeMap.put(1, "A1");
		orderOfTreeMap.put(3, "B1");
		orderOfTreeMap.put(5, "B1");
		orderOfTreeMap.put(4, "B1");
		orderOfTreeMap.put(6, "B1");
		orderOfTreeMap.put(7, "B1");
		orderOfTreeMap.put(8, "B1");
		
		System.out.println(orderOfTreeMap);
		// Display the key-value pairs in TreeMap
		NavigableMap<Integer, String> treeMap = orderOfTreeMap.descendingMap();
		orderOfTreeMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " +entry.getValue()));
		
		// Display all keys in TreeMap
		Set<Integer> keys = orderOfTreeMap.keySet();
		orderOfTreeMap.keySet().forEach(key -> System.out.println(key));
		
		// Display all keys in Descending Order in TreeMap
		System.out.println("Display all keys in Descending Order in TreeMap");
		NavigableSet<Integer> keysInDesOrders = orderOfTreeMap.descendingKeySet();
		for(Integer keysInDesc : keysInDesOrders){
			System.out.println(keysInDesc);
		}

		
		/**
		 * OutPut:-
		 * {1=A1, 3=B1, 4=B1, 5=B1, 6=B1, 7=B1, 8=B1}
			1 A1
			3 B1
			4 B1
			5 B1
			6 B1
			7 B1
			8 B1
			1
			3
			4
			5
			6
			7
			8
			Display all keys in Descending Order in TreeMap
			8
			7
			6
			5
			4
			3
			1
		 **/
		
	}
}
