package com.infinity.collection2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Makarand");
		list.add("Janmesh");
		list.add("Shubham");
		list.add("Vansh");
		list.add("Mrunali");
		
		
		//System.out.println(list);
//		for(String str : list) {
//			System.out.println("Original = "+str+", Capitalize = "+str.toUpperCase());
//		}
		
		Iterator<String> itr = list.iterator();
		while( itr.hasNext() ) {
			String str = itr.next();
			System.out.println("Original = "+str+", Capitalize = "+str.toUpperCase());
		}
	}
}








