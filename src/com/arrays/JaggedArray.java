package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int marks[][]=new int[3][];
		
		marks[0]=new int[3];
		marks[1]=new int[4];
		marks[2]=new int[2];
		
		int count=0;
		
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				marks[i][j]=count++;
			}
		}
		
		for(int i=0;i<marks.length;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
