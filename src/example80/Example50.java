package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_17:09
 */
public class Example50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("M: ");
        int m = scanner.nextInt();
        System.out.print("N: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[m+1][n];

        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max;
        for (int i = 0; i < matrix.length-1; i++) {
            max = matrix[0][i];//m=1
            for (int j = 1; j < matrix[j].length; j++) {
                if (matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            matrix[m][i] = max;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
