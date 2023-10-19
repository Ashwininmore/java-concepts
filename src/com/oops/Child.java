package com.oops;

public class Child extends Parent{
	
	public void cute() {
		System.out.println("Child  is so cute");
	}

	public static void main(String[] args) {
		Child ob=new Child();
		ob.cute();
		ob.money();
		
	}

}
