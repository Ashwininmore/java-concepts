package com.strings;

import java.util.StringTokenizer;

public class StringToknzDemo {

	public static void main(String[] args) {
		StringTokenizer sk=new StringTokenizer("Sathya Prakash Soma");
		while(sk.hasMoreTokens()) {
			System.out.println(sk.nextToken());
		}
	}

}
