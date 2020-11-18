package com.sort.mapobject;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.sort.bean.Employee;

public class SortMapOfObject {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Ram", 5000);
		map.put("Ota", 2000);
		map.put("Aad", 3000);
		map.put("Was", 2100);
		map.put("Gass", 7000);
		map.put("Gase", 6000);

		// Sort the Map object by Ascending order
		System.out.println("Sort the Map object based on key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("Sort the Map object based on value");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		// Custome key Object in Map
		Map<Employee, Integer> empMap = new HashMap<>();
		empMap.put(new Employee(10, "Rame", "IT", 1000), 10);
		empMap.put(new Employee(13, "OLA", "ADMIN", 5000), 50);
		empMap.put(new Employee(11, "Jaop", "SALSE", 2000), 17);
		empMap.put(new Employee(20, "Kopa", "HR", 11000), 12);
		empMap.put(new Employee(12, "Lio", "IT", 3000), 100);

		System.out.println("Sort the Map object based on Employee salary in ascending order");
		empMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpSalary)))
				.forEach(System.out::println);
		
		
		System.out.println("*******************************************");
		System.out.println("Sort the Map object based on Employee salary in descending order");
		empMap.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getEmpSalary).reversed()))
				.forEach(System.out::println);
	}

}
