package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:22
 */
public class Array21 {
    public static void main(String[] args) {
        array21(2, 5, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
    public static void array21(int k, int l, int[] array) {
        int sum = 0;
        double sol = 0;
        for (int i = k; i <= l; i++) {
            sum += array[i];
            sol = (double) sum / (l - k + 1);
        }
        System.out.println(sol);
    }
}

