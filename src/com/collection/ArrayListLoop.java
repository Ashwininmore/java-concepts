package com.collection;

import java.util.ArrayList;

public class ArrayListLoop {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++) {
			al.add(i);
		}
		System.out.println("Normal for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//for each loop
		System.out.println("For each loop");
		for(Object res:al) {
			System.out.println(res);
		}
		//odd numbers
		System.out.println("Odd Numbers:");
		for(Object k:al) {
			Integer i=(Integer)k;
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
