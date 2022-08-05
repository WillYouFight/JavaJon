package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:43
 */
public class Array93 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 4, 8, 9, 10};//2,4,6,8,10
        int k=0;
        int oddCount = 0;
        for (int i = 1; i < a.length; i+=2) {
            oddCount++;
        }
        int[] newArray = new int[a.length - oddCount];
        for (int i = 1; i < a.length; i+=2) {
            newArray[k++]=a[i];
        }
        ArrayUtil.show(newArray);
    }
}
