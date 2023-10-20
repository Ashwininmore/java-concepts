package com.polymorphism;
//overriding
class OldTv{
	public void tvSound() {
		System.out.println("Tv sound good");
	}
	public void tvRemote() {
		System.out.println("Tv remote is good");
	}
	public void tvScreen() {
		System.out.println("30 inch lcd screen its not looking good");
	}
}

public class NewTv extends OldTv{
	
	@Override
	public void tvScreen() {
		System.out.println("changed to LED");
	}

	public static void main(String[] args) {
		NewTv nt=new NewTv();
		nt.tvSound();
		nt.tvRemote();
		nt.tvScreen();
		

	}

}
