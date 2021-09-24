package com.huel;

import java.util.Scanner;

public class GameTest {
//public static void main(String[] args) {
//	System.out.print("请输入一个1-12的整数");
//	Scanner scanner=new	Scanner(System.in);
//	int month=scanner.nextInt();
//	if (month>=3&&month<=5) {
//		System.out.println(month+"月份为春季");
//	}else if (month>=6&&month<=8) {
//		System.out.println(month+"月份为夏季");
//	}else if (month>=9&&month<=11) {
//		System.out.println(month+"月份为秋季");
//	}else if (month==12||month==1||month==2) {
//		System.out.println(month+"月份为冬季");
//	}else {
//		System.out.println("您的输入有误,请重新输入");
//	}
	public static void main(String[] args) {
		System.out.println("=======================================================================");
		System.out.println("请输入您要查询的月份");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("月份为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("月份为春季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("月份为春季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("月份为春季");
			break;
		default:
			System.out.println("您的输入有误,请重新输入1-12的整数");
			break;
		}
		
	}
	
	
}

