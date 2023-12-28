package com.infinity.collection6;

import java.util.TreeSet;

public class TreeSetDemo1 {
	// TreeSet will also not allow duplicate objects
	// TreeSet is ordered collection
	// TreeSet will arrange the output in ascending order
	
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("Makarand");
		set.add("Janmesh");
		set.add("Shubham");
		set.add("Vansh");
		set.add("Mrunali");
		set.add("Arati");
		set.add("Makarand");
		
		System.out.println(set);
	}
}
