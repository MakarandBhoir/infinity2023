package com.infinity.collection1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1000);
		list.add(500);
		list.add(2000);
		list.add(2000);
		list.add(1500);
		list.add(1000);
		list.add(0, 10);
		
		System.out.println(list);
		
		list.remove(1);
		
		System.out.println(list);
	}
}
