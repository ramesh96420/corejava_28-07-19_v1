package com.maphashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMapJava8 {

	public static void main(String agrs[]){
		
		// Creating a HashMap
		Map<String, Double> employeeSalary = new HashMap<>();
		
		// Adding key-value pairs in HashMap
		employeeSalary.put("AB", 52000.0);
		employeeSalary.put("Sam", 85201.1);
		employeeSalary.put("Nirmala", 96321.0);
		employeeSalary.put("XYZ", 85213.5);
		
		System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
		employeeSalary.forEach((employee, salary) -> System.out.println(employee +" => "+ salary));
		
		System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
	    Set<Map.Entry<String, Double>> entries = employeeSalary.entrySet();
	    Iterator<Map.Entry<String, Double>> employeeSalaryIterator  = entries.iterator();
	    while(employeeSalaryIterator.hasNext()){
	    	Map.Entry<String, Double> entry = employeeSalaryIterator.next();
	    	System.out.println(entry.getKey() +" "+ entry.getValue());
	    }
	    
	    System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
	    employeeSalary.forEach((userName, salary) -> System.out.println(userName +" "+salary));
	    employeeSalary.entrySet().forEach(entry -> {
	    	System.out.println(entry.getKey() +" "+ entry.getValue());
	    });
	    
	    System.out.println("\n=== Iterating over the HashMap's entrySet using simple for-each loop ===");
	    for(Map.Entry<String, Double> entry : employeeSalary.entrySet()){
	    	String key = entry.getKey();
	    	Double value = entry.getValue();
	    	System.out.println(key +" "+ value);
	    }
	    
	    System.out.println("\n=== Iterating over the HashMap's keySet ===");
	    employeeSalary.keySet().forEach(employee -> System.out.println(employeeSalary.get(employee)));
	    
	    /**
	     * OutPut:-
	     * === Iterating over a HashMap using Java 8 forEach and lambda ===
				AB => 52000.0
				XYZ => 85213.5
				Nirmala => 96321.0
				Sam => 85201.1
				
				=== Iterating over the HashMap's entrySet using iterator() ===
				AB 52000.0
				XYZ 85213.5
				Nirmala 96321.0
				Sam 85201.1
				
				=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===
				AB 52000.0
				XYZ 85213.5
				Nirmala 96321.0
				Sam 85201.1
				AB 52000.0
				XYZ 85213.5
				Nirmala 96321.0
				Sam 85201.1
				
				=== Iterating over the HashMap's entrySet using simple for-each loop ===
				AB 52000.0
				XYZ 85213.5
				Nirmala 96321.0
				Sam 85201.1
				
				=== Iterating over the HashMap's keySet ===
				52000.0
				85213.5
				96321.0
				85201.1
	     **/
	}
}
