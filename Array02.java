package com.huel;

public class Array02 {
public static void main(String[] args) {
	int[][]array ={{1,3,5,7,9},{10,20,30},{300,400,600},{900,909,939,969,999}};
	System.out.println(array.length);
	System.out.println(array[0][1]+array[0][3]);
	System.out.println("===============");
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.println(array[i][j]);
		}
	}
}
}
