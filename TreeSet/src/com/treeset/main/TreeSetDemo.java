package com.treeset.main;

import java.util.TreeSet;

// TODO: Auto-generated Javadoc
/**
 * The Class TreeSetDemo.
 * 
 * Integer type value not allowed in TreeSet. It will give "ClassCastExceptoin".
 * null value not allowed in TreeSet. It will give "NullPointerException".
 * But null is allowed on in First Element only. Here Comparison are not required.
 */
public class TreeSetDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		
		// TreeSet
		@SuppressWarnings("rawtypes")
		TreeSet treeSet = new TreeSet();	//default constructor
		treeSet.add("Ramesh");
		treeSet.add("Sam");
		treeSet.add("Apple");
		treeSet.add("Babu");
		treeSet.add("Laxman");
		
		// dublicate Elements
		treeSet.add("Sam");
		
		// added integer type elements
		// Integer type value not allowed in TreeSet. It will give "ClassCastExceptoin".
		//treeSet.add(1);		
		
		// added null values
		// null value not allowed in TreeSet. It will give "NullPointerException".
		//treeSet.add(null);
		
		
		//sop
		System.out.println("TreeSet Elements using default Constructor.");
		System.out.println(treeSet);
	}
}
