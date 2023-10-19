package com.abstraction;
//100% abstraction
abstract class Shape{
	int length;
	int width;
	public abstract void area(int length, int width);
}
public class Rectangle extends Shape{
	@Override
	public void area(int length, int width) {
		System.out.println("Area of rectangle:"+(length*width));
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area(10, 3);

	}

	

}
