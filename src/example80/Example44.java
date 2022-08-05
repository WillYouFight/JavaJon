package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_16:08
 */
public class Example44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        int count=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println (matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
