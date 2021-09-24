package huel;

/**
 * Created by HUEL--张晓华 on2021/9/21 20:54
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Array02 {
    public static void main(String[] args) {
        int[]arr01={1,11,12,15,2,3,5,8};
        for (int i = 0; i <arr01.length-1 ; i++) {
            for (int j = 0; j <arr01.length-1-i ; j++) {
                if (arr01[j]>arr01[j+1]) {
                    int temp=arr01[j];
                    arr01[j]=arr01[j+1];
                    arr01[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <arr01.length ; i++) {
            System.out.println(arr01[i]);
        }
    }
    public void method(){
     //public上为方法分隔符
    }
}
