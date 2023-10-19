package com.oops;
//Multi-level Inheritance
public class Admin extends Developer{
	public void delete() {
		System.out.println("I can delete");
	}
	public static void main(String[] args) {
		Admin ob= new Admin();
		ob.read();
		ob.write();
		ob.delete();
	}
	
}
