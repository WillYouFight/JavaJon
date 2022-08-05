package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:11
 */
public class Array11 {
    public static void main(String[] args) {
        array11(3,new int[]{2,4,5,6,7,8,10,11,13,14,15,16,198,172
        });
    }
    public static void array11(int k, int[] array) {

        for (int i = k-1; i < array.length; i += k) {
            System.out.print(array[i]+"\t");
        }
    }
}
