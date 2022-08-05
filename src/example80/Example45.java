package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_21:50
 */
public class Example45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        int[][] matrix = new int[m][m];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "]" + "[" + j + "]: " + counter);
                matrix[i][j] = counter++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            for (int j = i + 1; j < matrix.length; j++) {
                System.out.print(matrix[j][matrix.length - 1 - i] + " ");
            }
            System.out.println();
        }
    }

}
