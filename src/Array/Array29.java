package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:26
 */
public class Array29 {
    public static void main(String[] args) {
        int[] array = new int[]{310, 2222, 4, 210, 1, 10, 1233, 2};
        System.out.println(array29(array));
    }
    public static int array29(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i ++) {
            if (i%2 != 0 && array[i]>max) max = array[i];
        }
        return max;
    }
}
