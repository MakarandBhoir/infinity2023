package com.infinity.collection1;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1000);
		hs.add("Infinity");
		hs.add(new Double(100.50));
		hs.add(1000);
		hs.add("Mumbai");
		
		System.out.println(hs);
	}

}
