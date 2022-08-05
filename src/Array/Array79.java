package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_23:01
 */
public class Array79 {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 1, 3, 1, -6, 4};
        ArrayUtil.show(a);
        ArrayUtil.show(rightShift(a));
        ArrayUtil.show(leftShift(a));
    }
    public static int[] rightShift(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = 0;
        return a;
    }

    public static int[] leftShift(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = 0;
        return a;
    }
}
