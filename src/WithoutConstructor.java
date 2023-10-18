
public class WithoutConstructor {

	int stid;
	String stname;
	
	public void assign() {
		stid=100;
		stname="Ashu";
	}
	public void display() {
		System.out.println(stid+" "+stname);
	}
	public static void main(String[] args) {
		WithoutConstructor ob=new WithoutConstructor();
		ob.assign(); //commemt this then o/p= 0 null
		ob.display();

	}

}
