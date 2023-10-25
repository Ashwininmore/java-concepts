package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
//		LinkedList al=new LinkedList();
//		Vector al=new Vector();
//		Stack al=new Stack();
		System.out.println(al.size());
//		System.out.println(al.capacity());
//		al.add(456);//it allow obj only//auto conversion
		al.add(new Integer(456)); //no need of this
		al.add(124);
		al.add("ashu");
		al.add(45.67);
		al.add(null);
		al.add(new Integer(456)); //no need of this
		al.add(124);
		al.add("ashu");
		al.add(45.67);
		al.add(null);//10th 
		al.add(null);//11th record
		System.out.println(al.size());
//		System.out.println(al.capacity());
		
		System.out.println(al);
	}

}
