package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:50
 */
public class Example71 {
    public static void main(String[] args) {
        double[][] matrix = {
                {1, 2, 3,5},
                {4, 5, 6,2},
                {7, 8, 9,1},
        };
        System.out.println(sumColumn(matrix, 3));
    }
    public static double sumColumn(double[][] matrix, int col ) {
        double sum = 0;
        if (col >= 0 && col < matrix[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][col];
            }
        }
        return sum;
    }
}
