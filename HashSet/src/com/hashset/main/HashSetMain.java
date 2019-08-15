package com.hashset.main;

import java.util.HashSet;

public class HashSetMain {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		
		//Create HashSet 
		@SuppressWarnings("rawtypes")
		HashSet hashSet = new HashSet();
		hashSet.add("Rame");
		hashSet.add("Apple");
		hashSet.add("Suresh");
		hashSet.add(10);
		
		// Adding null value
		hashSet.add(null);
		hashSet.add("Chandan");
		
		// Adding dublicate value
		hashSet.add("Apple");
		
		System.out.println("HashSet values");
		System.out.println(hashSet);
		
		// Remove the one value
		hashSet.remove("Chandan");
		System.out.println();
		System.out.println(hashSet);
	}
}
