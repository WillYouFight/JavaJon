package Array;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_16:17
 */
public class Array3 {
    public static void main(String[] args) {
        Progressiya (2,12,4);

    }
    public static void Progressiya(int d, int n ,int a) {
        int[] array = new int[n];
        a = array[0];
        for (int i = a; i <= n-1; i++) {//a1+(d*n-1)
            array[i] = array[0] + i * d;
        }
        System.out.println (Arrays.toString (array));
    }
}
