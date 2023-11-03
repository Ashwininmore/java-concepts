package classespredefined;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("notepad");
		Runtime.getRuntime().exec("shutdown -s -t 0"); //shutdown sys
		Runtime r=Runtime.getRuntime();
		
		System.out.println("total memory"+r.totalMemory());
		System.out.println("free memory"+r.freeMemory());
		
		
		
	}

}
