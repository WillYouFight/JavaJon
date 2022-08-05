package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:42
 */
public class Array92 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 4, 8, 9, 10};
        ArrayUtil.show(a);
        System.out.println(a.length);
        // toqlari soni aniqlanadi
        int oddCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1) oddCount++;
        }
        // yangi massiv elon qilinadi
        int[] newArray = new int[a.length - oddCount];
        // newArrayga a massivning juft qiymatlari copy qilinadi
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 1) newArray[index++] = a[i];
        }
        // a = newArray
        a = newArray;
        ArrayUtil.show(a);
        System.out.println(a.length);
    }
}
