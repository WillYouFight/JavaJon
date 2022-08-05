package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_18:25
 */
public class Array65 {
    public static void main(String[] args) {
        int[] a = {1, 5, 6, 9, 8, 3, 4};
        ArrayUtil.show(solution(a,3)); // 10 14 15 18 17 12 13
    }
    public static int[] solution(int[] a, int k) {
        int item = a[k];
        for (int i = 0; i < a.length; i++) {
            a[i] += item;
        }
        return a;
    }
}
