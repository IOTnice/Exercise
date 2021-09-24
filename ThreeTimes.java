package huel;

/**
 * Created by HUEL--张晓华 on2021/9/23 15:55
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class ThreeTimes {
    public static void main(String[] args) {
          int num=0;
        for (int i = 1; i <200 ; i++) {
            if (i%3 ==0) {
                System.out.print(i+"  ");
                num++;
                if (num%5==0) {
                    System.out.println("============");
                }
            }
        }
    }
}
