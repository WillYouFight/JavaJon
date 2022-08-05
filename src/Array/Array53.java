package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_13:00
 */
public class Array53 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 7, 8, 9, 11, 2};//11
        int[] b = {10, 51, 10, 2, 3, 7, 9, 1};//51
        int[] c = new int[ a.length ];// 7 ga teng
        for (int i = 0; i < a.length; i++) {
            if ( a[ i ] > b[ i ] ) {
                c[ i ] = a[ i ];
                System.out.print (c[ i ] + " ");
            } else {
                c[ i ] = b[ i ];
                System.out.print (c[ i ] + " ");
            }
        }
    }
}
