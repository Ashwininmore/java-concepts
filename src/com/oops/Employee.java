package com.oops;
class Person{
	String name;
	String address;
	
	public void details() {
		System.out.println(name+" "+address);
	}
}
class Manager extends Person{
	int salary=60000;
	String role="manager";
	
	public void work() {
		System.out.println("Managing all employee");
	}
}

public class Employee extends Manager{
	int empid=123;
	String work="files";
	public void empwork() {
		System.out.println("EmpId:"+empid+" "+work);
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empwork();
		emp.work();
		emp.details();
		

	}

}
