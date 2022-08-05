package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:10
 */
public class Array10 {
    public static void main(String[] args) {
        int[] arr = {10, 13, 26, 21, 19, 1, 2, 8, 14, 19};
        solution(arr);
    }
    public static void solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) System.out.print(array[i] + "\t");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 1)
                System.out.print(array[i] + "\t");
        }
    }
}
