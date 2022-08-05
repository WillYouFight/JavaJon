package Array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 20.06.2022_22:14
 */
public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ( );
        int[] arr = new int[ n ];
        for (int i = 0; i < n; i++) {
            arr[ i ] = i * 2 + 1;
        }
        System.out.println (Arrays.toString (arr));
    }

}


