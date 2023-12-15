package com.infinity.collection2;

import java.util.HashSet;

public class HashSetDemo1 {
	// HashSet will create object of HashMap
	// Default size or capacity is 16
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Makarand");
		set.add("Janmesh");
		set.add("Shubham");
		set.add("Vansh");
		set.add("Mrunali");
		
		set.add("Makarand2");
		set.add("Janmesh2");
		set.add("Shubham2");
		set.add("Vansh2");
		set.add("Mrunali2");
		
		set.add("Makarand3");
		set.add("Janmesh3");
		set.add("Shubham3");
		set.add("Vansh3");
		set.add("Mrunali3");
		
		System.out.println(set);
	}
}
