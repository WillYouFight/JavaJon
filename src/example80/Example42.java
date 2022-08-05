package example80;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:14
 */
public class Example42 {
    public static void main(String[] args) {
        masala42(new int[]{7, 8, 5, 2, 4, 6, 3});
    }

    public static void masala42(int[] array) {
        int[] array2=new int[array.length];
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for (int item : array)
            System.out.print(item + " ");
    }
}
