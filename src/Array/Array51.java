package Array;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 25.06.2022_16:56
 */
public class Array51 {
    public static void main(String[] args) {
        //0,1,2,3,4,  5
        int[] array1 = {2, 4, 6, 8, 10, 12};//
        int[] array2 = {11, 32, 53, 7, 19, 611};//
        System.out.println (Arrays.toString (array2));
        System.out.println (Arrays.toString (array1));
        //0,1,2,3, 4, 5
        change (array1, array2);
    }

    public static void change(int[] array1, int[] array2) {
        int t = 0;
        for (int i = 0; i < array1.length; i++) {
            t = array1[ i ];
            array1[ i ] = array2[ i ];
            array2[ i ] = t;
            System.out.print (array2[ i ] + " ");
        }
        System.out.println ( );
        for (int i = 0; i < array1.length; i++) {
            t = array1[ i ];
            array1[ i ] = array2[ i ];
            array2[ i ] = t;
            System.out.print (array2[ i ] + " ");
        }
    }
}
