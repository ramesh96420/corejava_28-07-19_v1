package com.generics;

import com.generics.bean.Employee;

// TODO: Auto-generated Javadoc
//Custom Generic Class
class Container<T> {

	// T is acceses any Type of value like Integer, double, float, Employee, any type..
	T value;

	//getter & setter methods
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	//show method
	public void show() {
		System.out.println(value.getClass().getName());
	}
}

/**
 * The Class CustomGenericClass.
 */
public class CustomGenericClass {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {

		// Generic type is Integer
		Container<Integer> containerTypeInt = new Container<>();
		containerTypeInt.value = 10;
		containerTypeInt.show();

		// Generic type is Double
		Container<Double> containerTypeDouble = new Container<>();
		containerTypeDouble.value = 2.1;
		containerTypeDouble.show();

		// Generic type is Employee
		Container<Employee> containerTypeEmployee = new Container<>();
		
		//Employee
		Employee employee = new Employee();
		employee.setValue(10);
		
		containerTypeEmployee.value = employee;
		containerTypeEmployee.show();

	}
}
