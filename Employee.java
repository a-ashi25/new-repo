package com.zensar.entity;

import java.io.Serializable;

public class Employee  {
	/**
	 * 
	 */
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private static Employee employee;
	private static int counter;
	

	public Employee() {
		super();
		counter++;
	}

	public Employee(int employeeId, String employeeName, int employeeSalary) {
		counter++;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public static Employee getInstance(){
		if(counter==0)  
			return employee = new Employee();
		else
			return employee;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {

		return "" + employeeId + " " + employeeName + " " + employeeSalary;
	}

	public int calculateSalary() {
		return 0;
	}

	public boolean equals(Object obj) {
		Employee e1 = (Employee) obj;
		if (this.employeeId == e1.getEmployeeId()
				&& this.employeeName == e1.getEmployeeName()
				&& this.employeeSalary == e1.getEmployeeSalary()) {
			return true;
		}
		return false;
	}
	
	
	
	
//	@Override
//	public int hashCode() {
//		return employeeNo;
//	}

}
