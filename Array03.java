package huel;

/**
 * Created by HUEL--张晓华 on2021/9/21 21:10
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Array03 {
    public static void main(String[] args) {
        int[][]array={{1,3,5,7},{1,10,13},{5,6,7,8},{100,1000,10000}};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
        System.out.println(array[0][1]);
        System.out.println("=======");
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
