package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 28.07.2022_22:40
 */
public class Example53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("M: ");
        int m = scanner.nextInt ( );
        System.out.print ("N: ");
        int n = scanner.nextInt ( );
        int[][] matrix = new int[ m ][ n ];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[ i ].length; j++) {
                System.out.print ("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[ i ][ j ] = scanner.nextInt ( );
            }
        }
        int min = Integer.MAX_VALUE;
        int minI = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[ i ].length; j++) {
                if ( matrix[ i ][ j ] < min ) {
                    min = matrix[ i ][ j ];
                    minI = i;
                }
            }
        }
        int index = 0;
        int[][] newMatrix = new int[ m - 1 ][ n ];
        for (int i = 0; i < matrix.length; i++) {
            if ( i == minI ) {
                continue;
            }
            for (int j = 0; j < matrix[ i ].length; j++) {
                newMatrix[ index ][ j ] = matrix[ i ][ j ];
            }
            index++;
        }
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[ i ].length; j++) {
                System.out.print (newMatrix[ i ][ j ] + " ");
            }
            System.out.println ( );
        }
    }
}
