package com.polymorphism;

public class Shape {
	
	public void area() {
		System.out.println("Don't know the area");
	}
	public void area(double r) {
		System.out.println("Circle area:"+(3.14*r*r));
	}
	public void area(double l, double b) {
		System.out.println("Rectangle area:"+(l*b));
	}
	public static void main(String[] args) {
		Shape s=new Shape();
		s.area();
		s.area(2.3);
		s.area(3.4, 1.2);
	}

}
