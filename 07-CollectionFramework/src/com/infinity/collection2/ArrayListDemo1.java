package com.infinity.collection2;

import java.util.ArrayList;

public class ArrayListDemo1 {
	// ArrayList can store duplicate objects
	// ArrayList is actually array internally - which can grow dynamically
	// By default size or capacity of ArrayList is 10
	// As soon as you add 11 object-> internal array is dynamically grows to size 15
	
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Makarand");
		list.add("Janmesh");
		list.add("Shubham");
		list.add("Vansh");
		list.add("Mrunali");
		list.add("Makarand 2");
		list.add("Janmesh 2");
		list.add("Shubham 2");
		list.add("Vansh 2");
		list.add("Mrunali 2");
		
		list.add("Mrunali 3");
		
		System.out.println(list);
	}

}
