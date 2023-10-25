package com.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		
		ts.add("Ashu");
//		ts.add(123);
		ts.add("Ashu");
		ts.add("Ashu");
		ts.add("Ashu");
		
		System.out.println(ts);
	}

}
