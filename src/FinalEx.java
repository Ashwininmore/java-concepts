class ParentFinal{
	int age=88;
	public void m1(int age) {
		this.age=++age;
		System.out.println("My parent age:"+this.age);
	}
}
public class FinalEx extends ParentFinal{
	public void m1(int age) {
		this.age=--age;
		System.out.println("My parent age:"+this.age);
	}
	public static void main(String[] args) {
		FinalEx f=new FinalEx();
		f.m1(77);

	}

}
