package com.infinity.collection7;

import java.util.Comparator;

public class EmployeeSalarySorter implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEmployeeSalary() > o2.getEmployeeSalary()) {
			return -1;
		}else {
			return 1;
		}
	}

}
