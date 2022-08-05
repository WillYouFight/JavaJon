package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:59
 */
public class Array76 {
    public static void main(String[] args) {
        array76(new int[]{1,2,3,4,5,3,2,5,6,7,8,9,1,3,2,4,3});
    }
    public static void array76(int[] array) {
        int index = 0;
        if (array[0] > array[1]) {
            index = 2;
            array[0] = 0;
        } else index = 1;

        for (int i = index; i < array.length - 1; i++) {
            if ((array[i - 1] < array[i]) && array[i] > array[i + 1]) {
                array[i] = 0;
                ++index;
            }
        }
        if (index == array.length - 1 && (array[array.length - 2] < array[array.length - 1]))
            array[array.length - 1] = 0;
        ArrayUtil.show(array);
    }
}
