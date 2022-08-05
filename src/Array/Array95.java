package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:44
 */
public class Array95 {
    public static void main(String[] args) {
        array95(new int[]{1, 2, 2, 2, 3, 3, 3, 4, 5, 6, 6, 6,});
    }
    public static void array95(int[] array) {
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[k] != array[i]) {
                ++k;
                array[k] = array[i];
            }
        }
        k++;
        int[] array1 =new int[k];

        for (int i = 0; i < k; i++) {
            array1[i] = array[i];
        }
        ArrayUtil.show(array1);
    }
}
