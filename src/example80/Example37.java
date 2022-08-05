package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:13
 */
public class Example37 {
    public static void main(String[] args) {
        arrayR(new int[]{1,11,2,4,6,7,9,1},5);
    }
    public static void arrayR(int[] array, int r) {
        int min = Math.abs(array[0] - r);
        int k = 1;
        for (int i = 1; i < array.length; ++i) {
            if (Math.abs(array[i] - r) < min) {
                min = (Math.abs(array[i] - r));
                k = i;
            }
        }
        System.out.println(array[k]);
    }
}
