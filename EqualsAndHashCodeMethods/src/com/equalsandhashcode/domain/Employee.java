package com.equalsandhashcode.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public class Employee {

	/** The emp id. */
	private String empId;
	
	/** The emp name. */
	private String empName;
	
	/**
	 * Gets the emp id.
	 *
	 * @return the emp id
	 */
	public String getEmpId() {
		return empId;
	}
	
	/**
	 * Sets the emp id.
	 *
	 * @param empId the new emp id
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	/**
	 * Gets the emp name.
	 *
	 * @return the emp name
	 */
	public String getEmpName() {
		return empName;
	}
	
	/**
	 * Sets the emp name.
	 *
	 * @param empName the new emp name
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/**
	 * equals methods.
	 *
	 * @param obj the obj
	 * @return true, if successful
	 */
	public boolean equals(Object obj){
		if(obj != null && obj instanceof Employee){
			String id = ((Employee)obj).getEmpId();
			if(id != null && id.equals(this.getEmpId())){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * hashCode methods.
	 *
	 * @return the int
	 */
	public int hashCode(){
		return this.getEmpId().hashCode();
	}
	
	
}
