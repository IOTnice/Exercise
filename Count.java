package test;

import java.util.Scanner;

public class Count {
	public static void main(String[]args) {
		int xingbie;
		int xblood;
		double weight;
		System.out.println("请选择你的性别，男性请选择1，女性请选择2 ");
		Scanner xingbieScanner = new Scanner(System.in);
		xingbie =xingbieScanner.nextInt();
		System.out.println("请输入你的体重:");
		weight = xingbieScanner.nextInt();
		if (xingbie == 1) {
			if (weight >= 60) {
				xblood=300;
				System.out.println("你本次献血可以选择："+xblood+"cc");
			}
			else {
				xblood = 250;
				System.out.println("你本次献血可以选择:"+xblood+"cc");
			}
		}
		else {
			if (xingbie == 2) {
				if (weight<50) {
					xblood=200;
					System.out.println("你本次献血可以选择:"+xblood+"cc");
				}
				else {
					xblood=250;
					System.out.println("你本次献血可以选择:"+xblood+"cc");
				}
			}
		}
	}
}
