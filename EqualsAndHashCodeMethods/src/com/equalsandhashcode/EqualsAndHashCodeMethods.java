package com.equalsandhashcode;

import java.util.HashMap;
import java.util.Map;

import com.equalsandhashcode.domain.Employee;

// TODO: Auto-generated Javadoc
/**
 * The Class EqualsAndHashCodeMethods.
 */
public class EqualsAndHashCodeMethods {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){
		
		int i = 10;
		int j = 10;
		Employee employee = new Employee();
		employee.setEmpId("abc");
		employee.setEmpName("Ramesh");
		
		Employee emp = new Employee();
		emp.setEmpId("abc");
		emp.setEmpName("Ramesh");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp, "DTDC");
		map.put(employee, "DTDC");
		
//		System.out.println(emp.equals(employee));		//false
//		System.out.println(emp == employee);			//fakse
		
		System.out.println(map.size());
		
		System.out.println(i==j); 		//true
		
	}
}
