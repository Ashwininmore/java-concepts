package com.collection;
class Animal{
	String name;
	Animal(String name){
		
	}
	void sound() {
		System.out.println("Every animal makes sound:"+name);
	}
}
public class Dog extends Animal{
	Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	String breed;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
