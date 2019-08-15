package com.immutable;



import java.util.Date;

import com.immutable.bean.Address;

public final class Employee {

	private final int empId;
	private final String empName;
	private Address address;
	private Date dob;
	
	public Employee(int empId, String empName, Address address, Date dob) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.dob = dob;
	}
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();		// here we can do the clone() than the data is not changed.
	}
	public Date getDob() {
		return (Date) dob.clone();	// here we can do the clone() than the date is not changed.
	}

	
}
