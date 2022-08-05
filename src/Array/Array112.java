package Array;

import arrayUtil.ArrayUtil;

import java.util.Arrays;
import java.util.Random;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 12.07.2022_22:56
 */
public class Array112 {
    public static void main(String[] args) {
        Random run=new Random ();
        int[] array = new int[run.nextInt (10)];
        System.out.println (Arrays.toString (array));
       ArrayUtil.show(array);
       sorting (array);
        ArrayUtil.show(array);
    }
    public static void sorting(int[] a) {
        System.out.println("Sorting...");
        long beginTime = System.currentTimeMillis();
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    //swap
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
        System.out.println("Finish!");
    }

}
