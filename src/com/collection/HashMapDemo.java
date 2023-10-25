package com.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap();
		hm.put(100, "Ashwini");
		hm.put(103, "minsmol");
		
//		hm.put("Rakesh", 34);//gives error bcz generic
		System.out.println(hm);
		System.out.println(hm.get(103));
		System.out.println(hm.containsKey(108));
		System.out.println(hm.isEmpty());
	}

}
