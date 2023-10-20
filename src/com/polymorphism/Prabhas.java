package com.polymorphism;

class Pparents{
	public void property() {
		System.out.println("1000 crors property");
	}
	public void marraige() {
		System.out.println("we want arrange marraige");
	}
}
public class Prabhas extends Pparents{
	@Override
	public void marraige() {
		System.out.println("Sorry dad i'm in love with Anushka");
	}
	public static void main(String[] args) {
		Prabhas p=new Prabhas();
		p.property();
		p.marraige();

	}

}
