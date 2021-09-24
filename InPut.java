package huel;

import java.util.Scanner;

/**
 * Created by HUEL--张晓华 on2021/9/23 15:35
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class InPut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a= scanner.nextInt();
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        if (a>num) {
            System.out.println(num);
            System.out.println(a);
        }else {
            System.out.println(a);
            System.out.println(num);
        }
    }
}
