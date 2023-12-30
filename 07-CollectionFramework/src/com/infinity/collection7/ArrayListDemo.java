package com.infinity.collection7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Makarand", 50000);
		Employee e2 = new Employee(1002, "Janmesh", 90000);
		Employee e3 = new Employee(1003, "Shubham", 85000);
		Employee e4 = new Employee(1004, "Abhilash", 40000);
		Employee e5 = new Employee(1005, "Raman", 55000);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e4);
		list.add(e5);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Before Sorting: ");
		print(list);
		
		Collections.sort(list, new EmployeeIdSorter());
		System.out.println("After Id Sorter: ");
		print(list);
		
		Collections.sort(list, new EmployeeSalarySorter());
		System.out.println("After Salary Sorter: ");
		print(list);
		
		Collections.sort(list, new EmployeeNameSorter());
		System.out.println("After Name Sorter: ");
		print(list);
	}

	private static void print(List<Employee> list) {
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			Employee emp = itr.next();
			System.out.println("Employee Id = "+emp.getEmployeeId());
			System.out.println("Employee Name = "+emp.getEmployeeName());
			System.out.println("Employee Salary = "+emp.getEmployeeSalary());
			System.out.println("----------------------------------------------");
		}
	}
}
