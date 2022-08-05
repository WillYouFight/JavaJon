package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_19:48
 */
public class Array68 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        ArrayUtil.show(array);
        System.out.println();
        array68(array);
    }

    public static void array68(int[] array) {
        int min = Integer.MAX_VALUE;
        int max1 =0;
        int min1 =0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > max) {
                max1 = array[i];

            } else if (array[i] < min) {
                min1 = array[i];
            }
        }
        if (max1 != min1) {
            int n=array[max1];
            array[max1]=array[min1];
            array[min1]=n;
        }
        ArrayUtil.show(array);
    }
}
