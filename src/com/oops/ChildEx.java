package com.oops;
//Multiple Inheritance is not possible in java
//bcz of ambiguity issue
//it is possible using interface
class Dad{
	public void sleep() {
		System.out.println("sleep left direction");
	}
}
class Mom{
	public void sleep() {
		System.out.println("sleep right side");
	}
}
//public class ChildEx extends Dad,Mom{
//
//	public static void main(String[] args) {
//		ChildEx ch=new ChildEx();
//		ch.sleep();
//
//	}

//}
