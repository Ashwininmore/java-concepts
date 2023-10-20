package com.polymorphism;

public class Calculator {
	
	public void add(int a,int b,int c) {
		System.out.println("Addition:"+(a+b+c));
	}
	public void add(int a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("Addition:"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("Addition:"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("Addition:"+(a+b));
	}
	public static void main(String[] args) {
		Calculator ob=new Calculator();
		ob.add(1.2f, 1.2f);
		ob.add(1.2f, 0);
		ob.add(3, 1.2f);
		ob.add(3, 4);
		ob.add('a', 'a');//type promotion//8 line method execute
		ob.add(1, 2, 3);

	}

}
