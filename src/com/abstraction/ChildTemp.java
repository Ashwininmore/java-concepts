package com.abstraction;
//100% abstraction
interface Template{
	void idea();
	public void design();
	public abstract void logic();
}

public class ChildTemp implements Template{
	@Override
	public void idea() {
		System.out.println("Idea is diff");
		
	}

	@Override
	public void design() {
		System.out.println("design is diff");
		
	}

	@Override
	public void logic() {
		System.out.println("i have logic to earn money");
		
	}
	public static void main(String[] args) {
		Template t=new ChildTemp();
		t.design();
		t.logic();
		t.idea();

	}

	

}
