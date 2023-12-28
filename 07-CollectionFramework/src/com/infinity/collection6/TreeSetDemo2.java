package com.infinity.collection6;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// collection will allow only object to add.
		TreeSet<Integer> ts = new TreeSet<>();
		
		int x = 101; // Is this object or primitive?
		Integer obj = x; //Auto-boxing is new feature of Java5
		
		double d = 10;
		//Double obj2 = 100;
		
		ts.add(100);
		ts.add(98);
		ts.add(103);
		ts.add(102);
		ts.add(x); // Auto-boxing: Convert primitive to object
		ts.add(obj);
		//ts.add(d);
		
		
		System.out.println(ts);
	}

}
