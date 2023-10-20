package pack1;
class Parent{
	public void m2() {
		System.out.println("Public Parent");
	}
}
public class Student {
	public void m1() {
		System.out.println("Public child");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.m1();
		Parent p=new Parent();
		p.m2();
	}
}

