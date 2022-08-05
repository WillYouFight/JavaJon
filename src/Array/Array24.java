package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:24
 */
public class Array24 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 21, 3};
        int test = array24 (arr1);
        System.out.println (test);
    }
    public static int array24(int[] array) {
        if ( array.length == 0 || array.length == 1 ) return 0;
        // ....
        int d = array[ 1 ] - array[ 0 ];
        int counter = 1;
        for (int i = 2; i < array.length; i++) {
            counter++;
            if ( array[ i ] - array[ i - 1 ] != d ) {
                System.out.println (" " + counter);
                return 0;
            }
        }
        System.out.println (" " + counter);
        return d;

    }

}

