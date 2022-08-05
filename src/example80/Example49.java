package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_17:22
 */
public class Example49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n + 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max;
        for (int i = 0; i < matrix.length; i++) {
            max = matrix[i][0];
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
            }
            matrix[i][n] = max;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
