package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_21:53
 */
public class Example51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M = ");
        int m = scanner.nextInt();
        System.out.print("N = ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix + [" + i + "] + [" + j +"]");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int min = matrix[0][0];
        int minI = 0,minJ = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minI = i;
                    minJ = j;
                }
            }

        }
        System.out.println(minI + " " + minJ);
    }
}
