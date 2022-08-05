package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 09.07.2022_22:34
 */
public class Array81 {
    public static void main(String[] args) {
        array81(new int[]{2,3,7,4,8,6,7,8,9,10,11},6);
    }

    public static void array81(int[] array, int k) {
        int[] a =new int[array.length];
        for (int i = array.length - 1; i > k - 1; --i) {
            a[i]=array[i-k];
            for (int j = 0; j < array.length-k ; j++) {
                a[j]=0;
            }
        }
        ArrayUtil.show(a);
    }
}

