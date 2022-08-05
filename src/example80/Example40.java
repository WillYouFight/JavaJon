package example80;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_20:46
 */
public class Example40 {
    public static void main(String[] args) {
        masala40(new int[]{3, 9, 2, 5, 6, 3, 15});
    }
    public static void masala40(int[] array) {
        for (int i = array.length-1; i > 0; i--) {//
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int a =array[j];
                    array[j]=array[j+1];
                    array[j+1]=a;
                }
            }
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
