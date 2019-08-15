package com.maphashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.maphashmap.bean.Employee;

public class HashMapWithEmployeeIsKeyEx1 {

	public static void main(String args[]){
		
		// Employee
		Employee emp = new Employee();
		emp.setEmpId(1);
		emp.setName("Charan");
		
		Employee emp1 = new Employee();
		emp1.setEmpId(2);
		emp1.setName("Ram");
		
		Employee emp2 = new Employee();
		emp2.setEmpId(3);
		emp2.setName("Earsha");
		
		// Map and HashMap
		Map<Integer, Employee> map = new HashMap<>();
		map.put(emp.getEmpId(), emp);
		map.put(emp1.getEmpId(), emp1);
		map.put(emp2.getEmpId(), emp2);
		
		// Set
		Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Employee> entry : entries){
			int key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(key +" "+ value);
			value.display();
					
		}
		
		/**
		 * OutPut:-
		 * 1 com.maphashmap.bean.Employee@15db9742
			Emp Id 1 and Emp Name Charan
			2 com.maphashmap.bean.Employee@6d06d69c
			Emp Id 2 and Emp Name Ram
			3 com.maphashmap.bean.Employee@7852e922
			Emp Id 3 and Emp Name Earsha
		 **/
	}
}
