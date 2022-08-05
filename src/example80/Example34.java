package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:11
 */
public class Example34 {
    public static void main(String[] args) {
        int[] r = {1,2,3,4,5};
        int[] r1 = {1,2,3,4,5,6};
        array16(r);
        array16(r1);
    }
    public static void array16(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            //9/2 =4.5
            System.out.print(array[i] + " ");
            System.out.print(array[array.length - i - 1] + " ");
        }
        if (array.length % 2 != 0) {
            System.out.println(array[array.length / 2]);
        }
    }
}
