package Matrix;

import java.util.Scanner;

/**
 * project : Array
 * package : Matrix
 * author  : Allamuradov Tal'at
 * date    : 20.07.2022_22:11
 */
public class Matrix5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("M: ");
        int m = scanner.nextInt ( );
        System.out.print ("N: ");
        int n = scanner.nextInt ( );
        System.out.print ("D: ");
        int d = scanner.nextInt ( );
        int[][] matrix = new int[ m ][ n ];
        int []array=new int[m];
        for (int i = 0; i < array.length; i++) {
            System.out.print ("arraydi {"+i+"} "+"=");
            array[i]=scanner.nextInt ();//{0}=2,{1}=4,{2}=6
        }
        for (int i = 0; i <matrix.length; i++) {
            int tr=0;
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=array[i]+tr;
                tr+=d;
                System.out.print (matrix[i][j]+"\t");
            }
            System.out.println ();
        }
    }
}
