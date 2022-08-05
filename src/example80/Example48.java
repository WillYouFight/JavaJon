package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 16.07.2022_21:51
 */
public class Example48 {
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

        boolean notFound = true;
        int minus = 0; // manfiy
        int plus = 0; // musbat
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) plus++;
                if (matrix[i][j] < 0) minus++;
            }
            if (minus == plus) {
                System.out.println(i);
                i = matrix.length;
                notFound = false;
            } else {
                plus = 0;
                minus = 0;
            }
        }

        if (notFound) System.out.println("Not found");
    }

}
