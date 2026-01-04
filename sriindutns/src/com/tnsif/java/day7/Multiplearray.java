package com.tnsif.java.day7;

public class Multiplearray {
	public static void main(String[] args) {
		int[][] array = new int [3][3];
		
		array[0][0]=1;
		array[0][1]=4;
		array[0][2]=6;
		
		array[1][0]=9;
		array[1][1]=2;
		array[1][2]=8;
		
		
		array[2][0]=3;
		array[2][1]=5;
		array[2][2]=7;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
