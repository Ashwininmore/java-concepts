package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hm= new HashMap();
		hm.put(100, "Ashwini");
		hm.put(103, "minsmol");
		hm.put(107, "Ashu");
		
//		hm.put("Rakesh", 34);//gives error bcz generic
		System.out.println(hm);
		System.out.println(hm.get(103));
		System.out.println(hm.containsKey(108));
		System.out.println(hm.isEmpty());
		//can't use iterator directly
		Set<Entry<Integer,String>> itr=hm.entrySet();
		Iterator<Entry<Integer,String>> result=itr.iterator();
		while(result.hasNext()) {
			System.out.println(result.next());
//			<Entry<Integer,String>> finalresult=itr.iterator();
		}
	}

}
