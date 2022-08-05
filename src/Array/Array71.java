package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:56
 */
public class Array71 {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 101, 3, 1, 6, 4};
        ArrayUtil.show(a);
        ArrayUtil.show(solution(a));
    }
    public static int[] solution(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = t;
        }
        return a;
    }
}
