package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:09
 */
public class Array9 {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6,7,8,9,13,10};
        array9(array);
    }
    public static void array9(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }
    }
}
