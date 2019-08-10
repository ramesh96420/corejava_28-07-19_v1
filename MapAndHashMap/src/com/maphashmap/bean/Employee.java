package com.maphashmap.bean;

public class Employee {

	private int empId;
	private String empName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int id) {
		this.empId = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setName(String name) {
		this.empName = name;
	}
	
	public void display(){
		System.out.println("Emp Id "+ getEmpId() +" and Emp Name "+ getEmpName());
	}
	
}
