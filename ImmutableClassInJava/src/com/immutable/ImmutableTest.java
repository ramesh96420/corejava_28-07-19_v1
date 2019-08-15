package com.immutable;

import java.util.Date;

import com.immutable.bean.Address;

public class ImmutableTest {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws CloneNotSupportedException{
		
		// Address
		Address address = new Address();
		address.setCity("Hyd");
		address.setAddressId(1);
		
		// Employee Immutable class
		Employee employee = new Employee(10, "Ramesh", address, new Date());
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getAddress());
		System.out.println(employee.getDob());
		
		Date dob = employee.getDob();
		dob.setYear(2017);
		
		System.out.println(employee.getDob());
		
	}
}
