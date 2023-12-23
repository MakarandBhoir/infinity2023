package com.infinity.collection5;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	
	public Employee() {
		
	}
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
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
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	@Override
	public int hashCode() {
		return employeeId*31;
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		if(this.employeeId == emp.getEmployeeId() && 
				this.employeeName.equals(emp.getEmployeeName()) && 
					this.employeeSalary == emp.getEmployeeSalary()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
}
