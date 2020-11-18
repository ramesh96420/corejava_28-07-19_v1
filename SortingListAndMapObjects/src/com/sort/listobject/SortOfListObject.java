package com.sort.listobject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sort.bean.Employee;

public class SortOfListObject {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(10);
		
		//sort the list of object by ascending order
		System.out.println("Assending Order");
		list.stream().sorted().forEach(System.out::println);
		
		//sort the list of object by descending order
		System.out.println("Decending Order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee(10, "Rame", "IT", 1000));
		listEmp.add(new Employee(13, "OLA", "ADMIN", 5000));
		listEmp.add(new Employee(11, "Jaop", "SALSE", 2000));
		listEmp.add(new Employee(20, "Kopa", "HR", 11000));
		listEmp.add(new Employee(12, "Lio", "IT", 3000));
		
		//sort the list of Employee object based on employee id ascending order
		System.out.println("Ascending order based on Employee Id");
		//listEmp.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).forEach(System.out::println);
		
		System.out.println("Ascending order based on Employee Name");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(System.out::println);
		
		System.out.println("Ascending order based on Employee Salary");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).forEach(System.out::println);
		
		
		System.out.println("Decending order based on Employee Salary");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).forEach(System.out::println);
		
		System.out.println("Decending order based on Employee Id");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpId).reversed()).forEach(System.out::println);
		
	}

}
