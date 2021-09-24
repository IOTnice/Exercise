package com.huel;

public class GameTest07 {
//public static void main(String[] args) {
//	int sum=0;
//	int count=0;
//	for (int i = 1; i <= 100; i++) {
//		if (i % 2 != 0) {
//			System.out.println(i);
//			sum+=i;
//			count++;
//		}
//	}
//	System.out.println("Ó‹”µ"+count);
//	System.out.println("1-100Ææ”µºÍžé"+sum);
public static void main(String[] args) {
	System.out.println("---------------------------------------------------------------");	
	int sum =0;
	int count=0;
	for (int i = 1; i <= 100; i++) {
		if (i%2==0) {
			continue;
		}
		System.out.println(i);
		sum+=i;
		count++;
	}
	System.out.println("Ææ”µ‚€”µžé:"+count);
	System.out.println("1-100µÄÆæ”µºÍžé:"+sum);
	}
}

