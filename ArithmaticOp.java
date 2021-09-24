package test;

/**
 * Created by HUEL--张晓华 on2021/9/14 11:39
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class ArithmaticOp {
    public static void main(String[] args) {
        int a=5+4, b=a*2, c=b/4;
        int d=b-c;
        int e=-d;
        int f=e%4;
        int i=3;
        int j=i++;
        int k=++i;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
        System.out.println("f="+f);
        System.out.println("i="+i);
        System.out.println("j="+j+"\nk="+k);

    }
}