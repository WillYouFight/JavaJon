package Array;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:01
 */
public class Array6 {
    public static void main(String[] args) {
        int []ar=new int[6];
        array6 (2,6,ar);
    }
    public static void array6(int a,int b,int []array){
        array[0]=a;
        array[1]=b;

        for (int i = 2; i < array.length; i++) {
            array[i]=0;
            for (int j = 0; j <i ; j++) {
                array[i]+=array[j];
            }
        }
        System.out.println (Arrays.toString (array));
    }
}
