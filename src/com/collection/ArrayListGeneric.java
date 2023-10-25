package com.collection;
//here client wants only String
//generic concept came---allow only string data
//generic means only that type is allow no need of type casting
import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {
//		ArrayList al=new ArrayList();
		ArrayList<String> al=new ArrayList<String>();
		al.add("idli");
		al.add("Bahubali");
		al.add("Bahubali");
//		al.add(789);//get compile type error
		al.add("Bahubali");
		al.add("Bahubali");
		al.add("Bahubali");
		al.add("Bahubali");
		
		System.out.println(al);
		

	}

}
