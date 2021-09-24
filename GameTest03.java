package com.huel;

public class GameTest03 {
public static void main(String[] args) {
	outer:for (int i = 1; i <= 9; i++) {
		inner:for (int j = 1; j <= i; j++) {
			System.out.print(j+"*"+i+"="+(j*i)+"\t");
		}
		System.out.println(" ");
	}
}
}
