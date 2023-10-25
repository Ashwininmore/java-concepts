package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bahubali");
		al.add("devasena");
//		al.add(789);//get compile type error
		al.add("kattapa");
		al.add("mahishmati");
		al.add("bhallala");
		al.add("nayana");
		System.out.println(al);
		
		System.out.println("****forward dir****");
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}

	
		System.out.println("****reverse dir*****");
		
//		ListIterator<String> ltr=al.listIterator(al.size());
//		while(ltr.hasPrevious()) {
//			System.out.println(ltr.previous());
//			}
		
		ListIterator<String> ltr=al.listIterator();
		while(ltr.hasNext()) {
			if(ltr.next().contains("nayana")) {
				ltr.set("Ashu");
			}
			}
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			}
	
	}

}
