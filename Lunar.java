package test;

import java.util.Scanner;

public class Lunar {
	public static void main(String[] args) {
		int year ;
		System.out.print("���������");
		Scanner yearScanner=new Scanner(System.in);
		year =yearScanner.nextInt();
		if (year>=2021||(year<=-3500)) {
			System.out.println("�������");
			System.exit(0);
		}
		if ((year%4==0)&&(year%100==0)&&(year>=-3500)&&(year<=2021)) {
			System.out.println("����");
		}else {
			System.out.println("ƽ��");
		}
	}
}
