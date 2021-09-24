package huel;

/**
 * Created by HUEL--张晓华 on2021/9/21 20:36
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Array01 {
    public static void main(String[] args) {
        int[] arr= new  int[]{1,3,5,7,8,10,11};
        int max=arr[0];
//        System.out.println(arr[0]);
//        System.out.println("===========================================================================================================================");
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("=====================================================");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值为"+max);
    }
}
