package test;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		double score;
		System.out.print("��������ĳɼ�");
		Scanner scoreScanner = new Scanner(System.in);
		score = scoreScanner.nextDouble();
		if (score> 100) {
			System.out.println("��ĳɼ��Ƿ�");
		}
		if (score<0) {
			System.out.println("��ĳɼ��Ƿ�");
		}
		if (score >= 90 &&score<=100 ) {
			System.out.println("��ĳɼ�Ϊ" + "A");
		}
		if (score >= 60 && score <= 89) {
			System.out.println("��ĳɼ�Ϊ" + "B");
		}
		if (score<60&&score>=0) {
			System.out.println("��ĳɼ�Ϊ" + "C");
		}
	}
}