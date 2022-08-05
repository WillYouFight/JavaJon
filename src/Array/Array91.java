package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:42
 */
public class Array91 {
    public static void main(String[] args) {
        array91(new int[]{1,2,3,4,5,6,7,8,9},2,5);
    }
    public static void array91(int[] a, int k, int m) {
        int n = a.length - m - k + 1;
        int[] b=new int[a.length];

        for (int i = k - 1; i < n; i++) {

            a[i] = b[i + (m - k + 1)];
        }
        ArrayUtil.show(a);
    }
}
