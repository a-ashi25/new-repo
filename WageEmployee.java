package com.zensar.entity;

import java.io.Serializable;

public class WageEmployee extends Employee implements Serializable {
	private int hours;
	private int rate;

	public WageEmployee() {
		super();
	}

	public WageEmployee(int id, String name, int salary, int hours, int rate) {
		/*
		 * this.setEmployeeId(id); this.setEmployeeName(name);
		 * this.setEmployeeSalary(salary);
		 */
		super(id, name, salary);
		this.hours = hours;
		this.rate = rate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + hours + " " + rate;
	}

	public int calculateSalary() {
		System.out.println("hi");
		return hours * rate;
	}

}
