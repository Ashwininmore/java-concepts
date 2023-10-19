package com.oops;
//Hierarchical Inheritance
class Father{
	public void meet() {
		System.out.println("want to meet two child");
	}
}
class Child1 extends Father{
	public void usa() {
		System.out.println("going to further studies: want to meet dad ");
	}
}
public class Child2 extends Father{
	public void birthday() {
		System.out.println("today is my birthday: want to meet dad ");
	}
	public static void main(String[] args) {
		Child2 ch2=new Child2();
		ch2.birthday();
		ch2.meet();
		
		Child1 ch1=new Child1();
		ch1.usa();
		ch1.meet();
	}
	
}

