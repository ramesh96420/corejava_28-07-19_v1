package com.treeset.main;

import java.util.TreeSet;

public class TreeSetMain {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		
		// Create the TreeSet
		@SuppressWarnings("rawtypes")
		TreeSet treeSet = new TreeSet();
		treeSet.add("Asha");
		treeSet.add("Sun");
		treeSet.add("Ramesh");
		
		// Adding the null value
		//treeSet.add(null);
		treeSet.add("Jam");
		
		// Adding dublicate value
		treeSet.add("Sun");
		
		System.out.println("TreeSet values");
		System.out.println(treeSet);
		
		// Removing value
		treeSet.remove("Jam");
		
		System.out.println();
		System.out.println(treeSet);
		
		
			
	}
}
