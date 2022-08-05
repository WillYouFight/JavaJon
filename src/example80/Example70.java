package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:39
 */
public class Example70 {
    public static void main(String[] args) {
        double[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(sumRow(matrix, 1, 3, 4));
    }
    public static double sumRow(double[][] matrix, int row, int m, int n) {
        double sum = 0;
        if (row >= 0 && row < matrix.length)
            for (int i = 0; i < matrix[row].length; i++) {
                sum += matrix[row][i];
            }
        return sum;
    }
}
