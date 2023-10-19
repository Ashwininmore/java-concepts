package com.abstraction;
//25% abstraction achieved
abstract class DadCarParts{
	public void doors() { //implemented methods
		System.out.println("I have four doors");
	}
	public void chassis() {
		System.out.println("chassis has more wheight 45.89mm gc");
	}
	public void wheels() {
		System.out.println("I have four wheels");
	}
	public abstract void engine();//abstract method//unimplemented
}
public class Car extends DadCarParts{

	@Override
	public void engine() {
		int engineBolts=234;
		int gears=89;
		int pistons=2;
		int strokes=4;
		String oil="castroil";
		
	}

	public static void main(String args[]) {
		Car c=new Car();
		c.doors();
		c.chassis();
		c.wheels();
		c.engine();
		
//		DadCarParts d=new DadCarParts();
//		can not create obj of abstract class
		DadCarParts d=new Car();
		
	}
}
