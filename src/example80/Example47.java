package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:16
 */
public class Example47 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        solution(matrix);
    }
    public static void solution(int[][] matrix) {
        int[] array = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int multi = 1;
            for (int j = 0; j < matrix.length; j++) {
                multi *= matrix[j][i];
            }
            array[i] = multi;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
