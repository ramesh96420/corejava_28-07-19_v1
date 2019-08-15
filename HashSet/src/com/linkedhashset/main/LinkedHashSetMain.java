package com.linkedhashset.main;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		
		// Create Linked Hash Set
		@SuppressWarnings("rawtypes")
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		linkedHashSet.add("Abhi");
		linkedHashSet.add("Ramu");
		linkedHashSet.add("Laxmi");
		linkedHashSet.add(10);
		
		// Add null values
		linkedHashSet.add(null);
		
		linkedHashSet.add("Banana");
		
		// Add dublicate value
		linkedHashSet.add("Ramu");
		
		System.out.println("Linked Hash Set Values");
		System.out.println(linkedHashSet);
		
		// Remove the value
		linkedHashSet.remove("Banana");
		System.out.println();
		System.out.println(linkedHashSet);
		
		
	}
}
