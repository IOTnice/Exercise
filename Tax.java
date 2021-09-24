package test;

import java.util.Scanner;

public class Tax{
	public static void main(String[]args) {
		double distance;
		double cost;
		System.out.print("请输入里程:");
		Scanner ddScanner = new Scanner(System.in);
		distance = ddScanner.nextDouble();
		if (distance<=2) {
			cost = 7;
			System.out.println("本次费用为:"+cost+"元");
		}
		else {
			int cost1 = (int)(7+(distance-2)*3);
			System.out.println("本次费用为:"+cost1);
		}
	}
}