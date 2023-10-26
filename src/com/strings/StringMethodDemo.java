package com.strings;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str="bahubali";
		String str1="bahubali";
		
		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(23));//error
		System.out.println(str.codePointAt(1));//return ascii
		System.out.println(str.codePointBefore(2));
		System.out.println(str.compareTo(str1));//0
		System.out.println(str.concat("india"));//bahubaliindia
		System.out.println(str.contains("bahu"));//t
		System.out.println(str.endsWith("li"));//t
		System.out.println(str.endsWith("l"));//f
		System.out.println(str.equalsIgnoreCase("BAHUBALI"));//t
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('k'));//-1
		System.out.println(str.indexOf('b'));//0
		System.out.println(str.lastIndexOf('b'));//4
		System.out.println(str.isEmpty());//
		System.out.println(str.length());
		System.out.println(str.replace(str,"capgimini"));
		System.out.println(str.substring(5));
		System.out.println(str.toUpperCase());
	}

}
