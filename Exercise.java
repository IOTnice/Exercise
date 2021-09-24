package huel;

/**
 * Created by HUEL--张晓华 on2021/9/21 21:18
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Exercise {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0) {
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("1-100的奇数和为"+sum);
        System.out.println("100以内的奇数有"+count+"个");
    }
}
