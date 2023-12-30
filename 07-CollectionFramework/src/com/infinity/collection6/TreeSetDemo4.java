package com.infinity.collection6;

import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		TreeSet<Employee> ts = new TreeSet<>();
		
		Employee e1 = new Employee(1001, "Janmesh", 75000);
		Employee e2 = new Employee(1001, "Shubham", 75000);
		Employee e3 = new Employee(1003, "Sneha", 90000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(null);
		
		System.out.println(ts);
	}
}
