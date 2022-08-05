package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:41
 */
public class Array90 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 4, 8, 9, 10};
        int k = 3;
        System.out.println(a.length); // 10
        ArrayUtil.show(a);
        // ...
        int[] newArray = new int[a.length - 1];
        // ....
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (i != k) newArray[index++] = a[i];
        }
        a = newArray;
        ArrayUtil.show(a);
        System.out.println(a.length); // 9
    }
}
