package methods;

import java.util.*;

public class LoginEx {
	String username;
	String password;
	void set() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Username:");
		username=sc.next();
		System.out.println("Enter the password:");
		password=sc.next();
	}
	public static void main(String[] args) {
		LoginEx ob=new LoginEx();
		ob.set();
		if(ob.username.equals("Ashu") && ob.password.equals("Ashu@123")) {
			System.out.println("Heyy Login success!!");
		}
		else {
			System.out.println("Oopps Login failed!!");
		}
	}

}
