package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:39
 */
public class Array86 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        leftShift(a, 3);
    }
    public static void leftShift(int[] a, int k) {
        for (int j = 0; j < k; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                a[i] = a[i + 1];
            }
            a[a.length - 1 - j] = 0;
        }
        ArrayUtil.show(a
        );
    }
}
