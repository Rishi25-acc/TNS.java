package com.tnsif.java.day7;

public class Jaggedarray {
	public static void main(String[] args) {
		int[][] Jaggedarray = new int[4][];
		Jaggedarray[0] = new int[2];
		Jaggedarray[1] = new int[3];
		Jaggedarray[2] = new int[4];
		Jaggedarray[3] = new int[5];
		
		int[][] jagged = {{2,3},{3,4,5},{5,6,7,8},{9,10,11,12,13}};
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+"  ");
			}
			System.out.println();
		}
		
	}

}
