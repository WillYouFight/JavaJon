package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:36
 */
public class Array77 {
    public static void main(String[] args) {
            array77(new int[]{2,3,5,4,6,8,7,9});//16 49
    }
    public static void array77(int[] array){
        int[] a=new int[array.length];
        for (int i = 1; i < array.length-1; i++) {
            a[i]=array[i];
            if (array[i]<array[i-1] && array[i]<array[i+1]){
                a[i]=array[i]*array[i];
            }
        }
        ArrayUtil.show(a);
    }
}
