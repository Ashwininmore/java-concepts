package com.collection;
//here client wants only String
//generic concept came---allow only string data
//generic means only that type is allow no need of type casting
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListGeneric {

	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
		ArrayList<String> al=new ArrayList<String>();
		al.add("Bahubali");
		al.add("devasena");
//		al.add(789);//get compile type error
		al.add("kattapa");
		al.add("mahishmati");
		al.add("bhallala");
		al.add("nayana");
		
		System.out.println(al);//o/p in array format
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next().contains("bhallala")) {
				itr.remove();
			}
		}
		for(String result:al) {
			System.out.println(result); //in iterator format
		}

	}

}
