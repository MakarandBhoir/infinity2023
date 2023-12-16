package com.infinity.collection3;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1; i<=50; i++) {
			list.add(i);
		}
		list.add(1234);
		list.add(4321);
		list.add(1000);
		list.add(200);
		list.add(250);
		
		list.add(3, 34);
		list.remove(2);
		
		System.out.println(list);
	}

}
