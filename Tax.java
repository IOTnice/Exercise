package test;

import java.util.Scanner;

public class Tax{
	public static void main(String[]args) {
		double distance;
		double cost;
		System.out.print("���������:");
		Scanner ddScanner = new Scanner(System.in);
		distance = ddScanner.nextDouble();
		if (distance<=2) {
			cost = 7;
			System.out.println("���η���Ϊ:"+cost+"Ԫ");
		}
		else {
			int cost1 = (int)(7+(distance-2)*3);
			System.out.println("���η���Ϊ:"+cost1);
		}
	}
}