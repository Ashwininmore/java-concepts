class ThisParent{
	int salary=55000;
	public void getSalary(int salary) {
		salary=65000;
		
		System.out.println("My parent salary:"+salary);
	}
}
public class ThisTest extends ThisParent{
	int salary=25000;
	
	public void getSalary(int salary) {
		salary=35000;
		
		System.out.println("My salary:"+salary);
		System.out.println("My current class salary:"+this.salary);
		System.out.println("My object is:"+this);
		super.getSalary(75000);
		System.out.println("My Parent class salary:"+this.salary);
	}
	public static void main(String[] args) {
		ThisTest tt=new ThisTest();
		tt.getSalary(45000);
		
		System.out.println(tt);
		
	}

}
