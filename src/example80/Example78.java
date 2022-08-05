package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:41
 */
public class Example78 {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 15, -1, 23, 4};
        System.out.println(maxElem(array));
    }
    public static int maxElem(int[] array) {
        if (array.length == 1) return array[0];
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        int max = maxElem(newArray);
        return Math.max(array[0], max);
    }
}
