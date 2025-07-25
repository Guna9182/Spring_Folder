package com.spec;

public class Employee {

	private int empId;
	private String empName;
	
	private Department department;

	public Employee() {
	}

	public Employee(int empId, String empName, Department department) {
		
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
