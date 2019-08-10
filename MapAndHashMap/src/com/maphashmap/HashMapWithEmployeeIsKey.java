package com.maphashmap;

import java.util.HashMap;
import java.util.Map;

import com.maphashmap.bean.Employee;

public class HashMapWithEmployeeIsKey {

	public static void main(String args[]){
		
		// Employee
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ramesh");
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Ram");
		
		Employee emp1 = new Employee();
		emp1.setId(3);
		emp1.setName("Sam");
		
		
		
		// HashMap
		Map<Employee, String> map = new HashMap<>();
		map.put(employee, "HSBC");
		map.put(emp, "DTDC");
		map.put(emp1, "INFOSYS");
		
		// Dublicate entry 
		map.put(emp1, "IBM");		// Here key is same so updated the old key value like "INFOSYS" to "IBM"
		
		for(Map.Entry<Employee, String> entry : map.entrySet()){
			int hashCodeValue = entry.hashCode();
			Employee key = entry.getKey();
			String value = entry.getValue();
			System.out.println( hashCodeValue +" "+ key +" "+ value);
		}
		
		/**
		 * OutPut:-
		 * 2018767734 com.maphashmap.bean.Employee@7852e922 IBM
			368733646 com.maphashmap.bean.Employee@15db9742 HSBC
			1831271315 com.maphashmap.bean.Employee@6d06d69c DTDC
		 **/
		
	}
}
