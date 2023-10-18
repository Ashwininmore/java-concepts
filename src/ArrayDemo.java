
public class ArrayDemo {

	public static void main(String[] args) {
		
		String names[]=new String[4];

		names[0]="Ashwini";
		names[1]="Sathya";
		names[2]="saurav";
		names[3]="Swami";
		
//		for looping
		
		for(int i=0;i<4;i++) {
			System.out.println(names[i]);
		}
		
//		for each
		for(String i:names) {
			System.out.println(i);
		}
		
//		predefined for loop
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
