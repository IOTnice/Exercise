package com.huel;

import java.util.Scanner;

public class GameTest {
//public static void main(String[] args) {
//	System.out.print("������һ��1-12������");
//	Scanner scanner=new	Scanner(System.in);
//	int month=scanner.nextInt();
//	if (month>=3&&month<=5) {
//		System.out.println(month+"�·�Ϊ����");
//	}else if (month>=6&&month<=8) {
//		System.out.println(month+"�·�Ϊ�ļ�");
//	}else if (month>=9&&month<=11) {
//		System.out.println(month+"�·�Ϊ�＾");
//	}else if (month==12||month==1||month==2) {
//		System.out.println(month+"�·�Ϊ����");
//	}else {
//		System.out.println("������������,����������");
//	}
	public static void main(String[] args) {
		System.out.println("=======================================================================");
		System.out.println("��������Ҫ��ѯ���·�");
		Scanner scanner=new Scanner(System.in);
		int month=scanner.nextInt();
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("�·�Ϊ����");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("�·�Ϊ����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("�·�Ϊ����");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�·�Ϊ����");
			break;
		default:
			System.out.println("������������,����������1-12������");
			break;
		}
		
	}
	
	
}

