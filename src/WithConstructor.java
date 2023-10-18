
public class WithConstructor {

	int stid;
	String stname;
	
	public WithConstructor() {
		stid=100;
		stname="Ashu";
	}
	public void display() {
		System.out.println(stid+" "+stname);
	}
	public static void main(String[] args) {
		WithoutConstructor ob=new WithoutConstructor();
		ob.display();

	}

}
