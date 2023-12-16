package com.infinity.collection4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Makarand", 5000);
		Employee e2 = new Employee(102, "Janmesh", 70000);
		Employee e3 = new Employee(103, "Vansh", 75000);
		Employee e4 = new Employee(104, "Sneha", 68000);
		Employee e5 = new Employee(105, "Mrunali", 65000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		printList(list);
		System.out.println("------------------------------------");
		searchEmplyee(list, 109);
		searchEmplyee(list, 101);
		searchEmplyee(list, 107);
		searchEmplyee(list, 102);
		searchEmplyee(list, 103);
		
		// add employee
		// delete employee
	}

	private static void searchEmplyee(List<Employee> list, int id) {
		boolean isFound = false;
		for(Employee emp : list) {
			if(id == emp.getEmployeeId()) {
				isFound = true;
			}
		}
		if(isFound) {
			System.out.println("Employee is present in list.");
		}else {
			System.out.println("Employee is not found in list.");
		}
	}

	private static void printList(List<Employee> list) {
		for(Employee emp : list) {
			System.out.println(emp.getEmployeeId()+", "+emp.getEmployeeName()+", "+emp.getEmployeeSalary());
		}
	}

}
