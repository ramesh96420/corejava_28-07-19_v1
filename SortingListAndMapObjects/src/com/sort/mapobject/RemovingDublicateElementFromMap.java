package com.sort.mapobject;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.sort.bean.Employee;

public class RemovingDublicateElementFromMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("asss", 1);
		map.put("poa", 25);
		map.put("pos", 45);
		map.put("ios", 7);
		map.put("oos", 5);
		map.put("osp", 45);
		map.put("asss", 11);
		map.put("poa", 250);
		map.put("pos", 41);
		
		System.out.println("Avoid the dublicate elements from the Map");
		map.entrySet().stream().distinct().forEach(System.out::println);
		
		System.out.println("Avoid the dublicate keys from the Map");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).distinct().forEach(System.out::println);
		
		System.out.println("Avoid the dublicate values from the Map");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).distinct().forEach(System.out::println);
		
		//Employee Object
		// Custome key Object in Map
		Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee(10, "Rame", "IT", 1000), 10);
		empMap.put(new Employee(13, "OLA", "ADMIN", 5000), 50);
		empMap.put(new Employee(11, "Jaop", "SALSE", 2000), 17);
		empMap.put(new Employee(20, "Kopa", "HR", 11000), 12);
		empMap.put(new Employee(12, "Lio", "IT", 3000), 100);
		empMap.put(new Employee(22, "Kopa", "HR", 1100), 72);
		empMap.put(new Employee(12, "OLA", "IT", 3000), 10);
		
		System.out.println();
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpSalary))).forEach(System.out::println);
		
		

	}

}
