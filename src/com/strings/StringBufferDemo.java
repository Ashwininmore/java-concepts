package com.strings;
//StringBuffer are mutable
public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("capgemini");
		StringBuffer sb1= new StringBuffer("capgemini");
		
		sb.append("india");
		System.out.println(sb);
		//here it checks references are same or not
		System.out.println(sb.equals(sb1)); //come from Object class
		System.out.println(sb==sb1);
		
	}

}
