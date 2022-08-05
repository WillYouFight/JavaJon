package Matrix;

import arrayUtil.ArrayUtil;

import java.util.Scanner;

/**
 * project : Array
 * package : Matrix
 * author  : Allamuradov Tal'at
 * date    : 22.07.2022_17:39
 */
public class Matrix6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("M: ");
        int m = scanner.nextInt ( );
        System.out.print ("N: ");
        int n = scanner.nextInt ( );
        System.out.print ("Q: ");
        int q = scanner.nextInt ( );
        int[][] matrix = new int[ m ][ n ];
        for (int i = 0; i < matrix.length; i++) {
            System.out.print ("arraydi {" + i + "} " + "=");
            matrix[i][0] = scanner.nextInt ( );//{0}=2,{1}=4,{2}=6
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[ i ][ j ] = matrix[i][j-1]*q;//0,1=8//0,2=16
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print (matrix[i][j]+"\t");
            }
            System.out.println ();
        }
    }
}
