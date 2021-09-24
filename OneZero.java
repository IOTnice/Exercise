package com.huel;

/**public class OneZero {
public static void main(String[] args) {
	int counter=0;
	int sum=0;
	for (int i = 0; i <=100; i++) {
		if (i%2==0) {
			System.out.println(i);
			counter++;
			sum+=i;
		}
	}
	System.out.println("=======================");
	System.out.println("统计次数为:"+counter);
	System.out.println("1-100内的偶数和为:"+sum);
}
}*/
public  class OneZero{
	public static void main(String[] args) {
		int count=0;
		int sum1=0;
		for (int i1 = 0; i1 <=1000; i1++) {
			if (i1%2!=0) {
				System.out.println(i1);
				count++;
				sum1+=i1;
			}
		}
		System.out.println("======================");
		System.out.println("统计次数为:"+count);
		System.out.println("100以内的奇数和为:"+sum1);
	}
}
