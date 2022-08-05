package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:35
 */
public class Array82 {
    public static void main(String[] args) {
        array82(new int[]{2,3,7,4,8,6,7,8,9,10,11},6);
    }
    public static void array82(int[] array, int k) {
        int[] a =new int[array.length];
        for (int i = 0; i< a.length-k; ++i) {
            a[i]=array[i+k];
            for (int j = a.length-k; j < a.length; j++) {
                a[j]=0;
            }
        }
        ArrayUtil.show(a);
    }
}
