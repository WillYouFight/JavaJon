package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:40
 */
public class Array89 {
    public static void main(String[] args) {
        array89(new int[]{1, 2, 3, 4, 5, 6, 1, 7, 8});
    }
    public static void array89(int[] array) {
        for (int i = array.length-2; i >=0; --i) {
            if (array[i]>array[i+1]){
                array[i+1]+=array[i];
                array[i]=array[i+1]-array[i];
                array[i+1]=array[i+1]-array[i];
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                array[i - 1] += array[i];
                array[i] = array[i - 1] - array[i];
                array[i - 1] = array[i - 1] - array[i];
            }
        }
        ArrayUtil.show(array);
    }
}
