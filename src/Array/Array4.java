package Array;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_19:43
 */
public class Array4 {
    public static void main(String[] args) {
        int[]ar=new int[3];
        geometricProgressia (4,3, ar);
    }
    public static void geometricProgressia(int a, int d, int[] array) {
        array[0] = a;
        int pow = 1;
        for (int i = 1; i <= array.length - 1; i++) {
            pow *= d;
            array[i] = array[0] * pow;
        }
        System.out.println (Arrays.toString (array));
    }
}
