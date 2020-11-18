package com.sort.listobject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.sort.bean.Employee;

public class RemovingDublicateElementFromList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Rame");
		list.add("Aas");
		list.add("add");
		list.add("pos");
		list.add("Rame");
		list.add("Aas");
		
		//avoiding the duplicate values from list
		System.out.println("avoiding the duplicate values from list");
		list.stream().distinct().forEach(System.out::println);
		
		//List Employee
		List<Employee> listEmp = new ArrayList<>();
		listEmp.add(new Employee(10, "Rame", "IT", 1000));
		listEmp.add(new Employee(13, "OLA", "ADMIN", 5000));
		listEmp.add(new Employee(11, "Jaop", "SALSE", 2000));
		listEmp.add(new Employee(20, "Rame", "HR", 11000));
		listEmp.add(new Employee(12, "Lio", "IT", 3000));
		listEmp.add(new Employee(12, "Jaop", "IT", 3000));
		
		//avoiding duplicate employee name from the employee list
		System.out.println("avoiding duplicate employee name from the employee list");
		listEmp.stream().map(emp -> emp.getEmpName()).distinct().forEach(System.out::println);
		
		System.out.println("sorting employee object based on empId");
		listEmp.stream().map(emp -> emp.getEmpId()).sorted().forEach(System.out::println);
		
		System.out.println("sorting employee object based on empId with out dublicate empid's");
		listEmp.stream().map(emp -> emp.getEmpId()).sorted().distinct().forEach(System.out::println);
		
		System.out.println("sorting employee object based on empSalary with assending order");
		listEmp.stream().map(emp -> emp.getEmpSalary()).sorted().forEach(System.out::println);
		
		System.out.println("sorting employee object based on empSalary with descending order");
		listEmp.stream().map(emp -> emp.getEmpSalary()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("print employee object based on empSalary with assending order");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpSalary)).forEach(System.out::println);
		
		System.out.println("print employee object based on empSalary with dessending order");
		listEmp.stream().sorted(Comparator.comparing(Employee::getEmpSalary).reversed()).forEach(System.out::println);
		
		//--
		/**
		 * 
		 * avoiding the duplicate values from list
			Rame
			Aas
			add
			pos
			avoiding duplicate employee name from the employee list
			Rame
			OLA
			Jaop
			Lio
			sorting employee object based on empId
			10
			11
			12
			12
			13
			20
			sorting employee object based on empId with out dublicate empid's
			10
			11
			12
			13
			20
			sorting employee object based on empSalary with assending order
			1000.0
			2000.0
			3000.0
			3000.0
			5000.0
			11000.0
			sorting employee object based on empSalary with descending order
			11000.0
			5000.0
			3000.0
			3000.0
			2000.0
			1000.0
			print employee object based on empSalary with assending order
			Employee [empId=10, empName=Rame, empDepartment=IT, empSalary=1000.0]
			Employee [empId=11, empName=Jaop, empDepartment=SALSE, empSalary=2000.0]
			Employee [empId=12, empName=Lio, empDepartment=IT, empSalary=3000.0]
			Employee [empId=12, empName=Jaop, empDepartment=IT, empSalary=3000.0]
			Employee [empId=13, empName=OLA, empDepartment=ADMIN, empSalary=5000.0]
			Employee [empId=20, empName=Rame, empDepartment=HR, empSalary=11000.0]
			print employee object based on empSalary with dessending order
			Employee [empId=20, empName=Rame, empDepartment=HR, empSalary=11000.0]
			Employee [empId=13, empName=OLA, empDepartment=ADMIN, empSalary=5000.0]
			Employee [empId=12, empName=Lio, empDepartment=IT, empSalary=3000.0]
			Employee [empId=12, empName=Jaop, empDepartment=IT, empSalary=3000.0]
			Employee [empId=11, empName=Jaop, empDepartment=SALSE, empSalary=2000.0]
			Employee [empId=10, empName=Rame, empDepartment=IT, empSalary=1000.0]

		 * **/
	}

}
