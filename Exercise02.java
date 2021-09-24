package huel;

/**
 * Created by HUEL--张晓华 on2021/9/21 21:23
 *
 * @Author-- 张大爷
 * IntelliJ IDEA
 * Java
 */
public class Exercise02 {
    @SuppressWarnings("AlibabaLowerCamelCaseVariableNaming")
    public static void main(String[] args) {
        int[]ArrayTest=new int[]{25,24,12,76,101,96,28};
        System.out.println(ArrayTest.length);
        for (int i = 0; i <ArrayTest.length ; i++) {
            for (int j = 0; j <ArrayTest.length-1-i ; j++) {
                if (ArrayTest[j]>ArrayTest[j+1]) {
                    int temp=ArrayTest[j];
                    ArrayTest[j]=ArrayTest[j+1];
                    ArrayTest[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <ArrayTest.length ; i++) {
            System.out.println(ArrayTest[i]);
        }
    }
}
