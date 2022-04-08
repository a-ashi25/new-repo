package com.zensar.entity;

public class SalesPerson extends WageEmployee {
	private int comission;

	public SalesPerson() {
		super();
	}

	public SalesPerson(int id, String name, int salary, int hours, int rate,
			int comission) {
		super(id, name, salary, hours, rate);
		this.comission = comission;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + comission;
	}

	public int calculateSalary() {
		return super.calculateSalary() + comission;
	}

}
