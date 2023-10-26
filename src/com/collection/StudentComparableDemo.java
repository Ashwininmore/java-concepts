package com.collection;
//crl+shift+o--------import package
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student>{
	int stid;
	String stname;
	int stage;
	
	public Student(int stid, String stname, int stage) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stage = stage;
	}
	@Override
	public int compareTo(Student s) {
		if(stage<s.stage)
			return -1;
		else if(stage>s.stage)
			return 1;
		else
			return 0;
	}
}
public class StudentComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al =new ArrayList<Student>();
		al.add(new Student(100, "Ashu", 22));
		al.add(new Student(170, "Rakesh", 20));
		al.add(new Student(108, "Harish", 19));
		al.add(new Student(100, "Aashritha", 22));
		al.add(new Student(100, "Harika", 22));
		
		System.out.println(al);
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.stage+"="+st.stname);
		}
	}

}
