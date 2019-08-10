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
		/**
		 * We can override the hashCode() and equals() methods.
		 * when we are passing same "key" and "value" in a map.
		 * Than the map size is showing 1 other map wise size is 2.
		 * We don't need to override the hashCode() and equals() methods in Wrapper Classes like Integer, Double....
		 * Why because all Wrapper Classes by default already override the hashCode() and equals() again we no need that.
		 * **/
		
		//Map Object with Employee key.
		Map<Employee, String> map = new HashMap<>();
		map.put(emp, "DTDC");
		map.put(employee, "DTDC");
		
		System.out.println(map.size());		//OutPut: 1. here we must and should implement the hashCode() and equals() methods than size is 1 other wise 2.
		
//		System.out.println(emp.equals(employee));		//false
//		System.out.println(emp == employee);			//fakse
		
		System.out.println(i==j); 		//true
		
	}
}
