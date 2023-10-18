package methods;

public class calculator {
    int id=100;
	public void display() {
		System.out.println("I am display methods");
	}
	public void sumOfTwoNumbers(int a, int b) {
		System.out.println("Addition:"+(a+b));
	}
	public int mulOfTwoNums(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		calculator ob =new calculator();
		System.out.println("Student Id:"+ob.id);
		ob.display();
		ob.sumOfTwoNumbers(10, 20);
		System.out.println(ob.mulOfTwoNums(4, 5));
	}

}
