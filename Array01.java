package com.huel;

public class Array01 {
public static void main(String[] args) {
	int[]array =new int[] {1,300,99,78,999,110};
	System.out.println(array[0]);
	//array[0]=100;
	System.out.println(array[0]);
	int max=array[0];
	for (int i = 0; i < array.length; i++) {
		if (array[i]>max) {
			max=array[i];
		}
	}
	System.out.println("最大值为"+max);
	System.out.println("====================");
	for (int i = 0; i < array.length-1; i++) {
		for (int j = 0; j < array.length-1-i; j++) {
			if (array[j]<array[j+1]) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
		
	}
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
}
}
