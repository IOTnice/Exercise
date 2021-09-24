package huel;

import java.util.Scanner;

/**
 * Created by HUEL--张晓华 on2021/9/18 14:48
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Count {
    public static void main(String[] args) {
        int a,b,c,d,maxnum;
        Scanner number=new Scanner(System.in);
        System.out.print("请输入整数a  ");
        a  =  number.nextInt();
        System.out.print("请输入整数b  ");
        b  =  number.nextInt();
        System.out.print("请输入整数c  ");
        c  =  number.nextInt();
        System.out.print("请输入整数d  ");
        d  =  number.nextInt();
        maxnum=(a>b?a:b)>(c>d?c:d)?(a>b?a:b):(c>d?c:d);
        System.out.println("最大值为"+maxnum);
    }
}
