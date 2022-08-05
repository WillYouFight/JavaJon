package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:57
 */
public class Array74 {
    public static void main(String[] args) {
        int[] a = {1, 5, 8, 9, 1, 3, 1, -6, 4};
        ArrayUtil.show(a);
        ArrayUtil.show(solution(a));
    }
    public static int[] solution(int[] a) {
        int minIndex = 0, maxIndex = 0;
        int min = a[minIndex], max = a[maxIndex];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
                minIndex = i;
            }
            if (max < a[i]) {
                max = a[i];
                maxIndex = i;
            }
        }
        for (int i = Math.min(minIndex, maxIndex) + 1; i < Math.max(minIndex, maxIndex); i++) {
            a[i] = 0;
        }
        return a;
    }
}
