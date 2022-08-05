package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:44
 */
public class Array96 {
    public static void main(String[] args) {
        array96(new int[]{1, 2, 1, 3, 4, 3, 2, 4});
    }
    public static void array96(int[] array) {
        int k = 0;
        for (int i = 1; i < array.length; i++) {
            array[k++] = array[i];
            for (int j = 0; j < k; j++) {
                if (array[k] == array[j]) {
                    k--;
                    break;
                }
            }
            k++;
        }
        k++;
        int[] array1 = new int[k];

        for (int i = 0; i < array1.length
                ; i++) {
            int item = array[i];
            array1[i] = item;
        }
        ArrayUtil.show(array1);
    }
}
