package com.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		
		li.add("Ashu");
		li.add("Sathya");
		li.add(123);
		li.add(24.54);
		li.add("Sathya");
		li.add(123);
		li.add(24.54);
		li.add("Sathya");
		li.add(123);
		li.add(24.54);
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.contains(123));//ele is there or not//true
		System.out.println(li.equals("Sathya"));
		System.out.println(li.get(4));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.getFirst());
		
		
	}

}
