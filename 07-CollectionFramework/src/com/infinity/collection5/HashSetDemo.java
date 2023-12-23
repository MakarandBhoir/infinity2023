package com.infinity.collection5;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Janmesh", 75000);
		Employee e2 = new Employee(1002, "Shubham", 75000);
		
		Employee e3 = new Employee(1002, "Shubham", 75000);
		Employee e4 = e1;
		
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		
		HashSet<Employee> hs = new HashSet<>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3); // will this add?
		hs.add(e4); // will this add?
		
		//1. Directly use in sysout
		//2. we can use for...each
		//3. iterator interface
		print(hs);
	}

	private static void print(HashSet<Employee> hs) {
		Iterator<Employee> itr = hs.iterator();
		while( itr.hasNext() ) {
			Employee employee = itr.next();
			System.out.println("Employee Id = "+employee.getEmployeeId());
			System.out.println("Employee Name = "+employee.getEmployeeName());
			System.out.println("Employee Salary = "+employee.getEmployeeSalary());
			System.out.println("----------------------------------");
		}
	}
}
