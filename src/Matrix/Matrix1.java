package Matrix;

/**
 * project : Array
 * package : Matrix
 * author  : Allamuradov Tal'at
 * date    : 09.07.2022_22:47
 */
public class Matrix1 {
    public static void main(String[] args) {
        int [][]matrix ={{1,2,3},
                         {4,5,6},
                         {7,8,9},
                         {2,3,7},};
        matrix1(matrix);
    }
    public static void matrix1(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=i*10;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
