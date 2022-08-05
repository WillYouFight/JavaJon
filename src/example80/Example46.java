package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 20.07.2022_16:39
 */
public class Example46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }

        }
    }
}
