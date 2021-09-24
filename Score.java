package test;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		double score;
		System.out.print("请输入你的成绩");
		Scanner scoreScanner = new Scanner(System.in);
		score = scoreScanner.nextDouble();
		if (score> 100) {
			System.out.println("你的成绩非法");
		}
		if (score<0) {
			System.out.println("你的成绩非法");
		}
		if (score >= 90 &&score<=100 ) {
			System.out.println("你的成绩为" + "A");
		}
		if (score >= 60 && score <= 89) {
			System.out.println("你的成绩为" + "B");
		}
		if (score<60&&score>=0) {
			System.out.println("你的成绩为" + "C");
		}
	}
}