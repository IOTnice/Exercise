package test;

import java.util.Scanner;

public class Count {
	public static void main(String[]args) {
		int xingbie;
		int xblood;
		double weight;
		System.out.println("��ѡ������Ա�������ѡ��1��Ů����ѡ��2 ");
		Scanner xingbieScanner = new Scanner(System.in);
		xingbie =xingbieScanner.nextInt();
		System.out.println("�������������:");
		weight = xingbieScanner.nextInt();
		if (xingbie == 1) {
			if (weight >= 60) {
				xblood=300;
				System.out.println("�㱾����Ѫ����ѡ��"+xblood+"cc");
			}
			else {
				xblood = 250;
				System.out.println("�㱾����Ѫ����ѡ��:"+xblood+"cc");
			}
		}
		else {
			if (xingbie == 2) {
				if (weight<50) {
					xblood=200;
					System.out.println("�㱾����Ѫ����ѡ��:"+xblood+"cc");
				}
				else {
					xblood=250;
					System.out.println("�㱾����Ѫ����ѡ��:"+xblood+"cc");
				}
			}
		}
	}
}
