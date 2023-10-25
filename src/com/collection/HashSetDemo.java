package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
//		HashSet hs=new HashSet(); //insertion order is not preserved
		LinkedHashSet hs=new LinkedHashSet();//hashcode////insertion order is preserved
		for(int i=0;i<=10;i++) {
			hs.add(i);
		}
		hs.add(-23);
		hs.add(null);
		hs.add("Hii");
		System.out.println(hs); 
		
		
	}

}
