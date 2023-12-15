package com.infinity.collection2;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
	// LinkedHashSet will also not allow duplicate objects
	// LinkedHashSet is ordered collection
	
	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Makarand");
		set.add("Janmesh");
		set.add("Shubham");
		set.add("Vansh");
		set.add("Mrunali");
				
		System.out.println(set);
	}
}
