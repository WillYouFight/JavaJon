package Matrix;

import java.util.Scanner;

/**
 * project : Array
 * package : Matrix
 * author  : Allamuradov Tal'at
 * date    : 20.07.2022_21:55
 */
public class Matrix3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("M: ");
        int m = scanner.nextInt ( );
        System.out.print ("N: ");
        int n = scanner.nextInt ( );
        int[][] matrix = new int[ m ][ n ];
        int []array=new int[m];
        int counter=1;
        for (int i = 0; i < array.length; i++) {
            System.out.print ("arraydi {"+i+"} "+"=");
            array[i]=scanner.nextInt ();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[ i ].length; j++) {
                matrix[ i ][ j ] =counter++;
            }
        }
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=array[j];
                System.out.print (matrix[i][j]+"\t");
            }
            System.out.println ();
        }
    }
}
