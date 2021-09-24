package huel;

/**
 * Created by HUEL--张晓华 on2021/9/23 16:07
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Multi {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.println("");
        }
    }
}
