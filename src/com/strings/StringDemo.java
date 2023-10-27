package com.strings;

public class StringDemo {

	public static void main(String[] args) {
		//literal way
		String name="India"; //strings are immutable
		String name1="India";
//		name.concat("sathya");
		
//		System.out.println(name);
		//comes from stringclass
		System.out.println(name.equals(name1));//t //check the values are equal or not
		System.out.println(name==name1);//t //will check both referring to same location or not
	
		//by new keyword
		String str=new String("Bahubali");
		String str1=new String("Bahubali");
		System.out.println(str.equals(str1));//t //check the values are equal or not
		System.out.println(str==str1);//f
	}

}
