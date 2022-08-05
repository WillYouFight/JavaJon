package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:12
 */
public class Example35 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3,4,5,6});
        System.out.println();
        solution(new int[]{1, 2, 3,4,5,6,7});
    }
    public static void solution(int[] array) {
        for (int i = 0; i < array.length / 2 + 1; i += 2) {
            System.out.print(array[i] + " ");
            if (array.length / 2 > i) {
                System.out.print(array[i + 1] + " ");
            }
            if (array.length - i - 1 > array.length / 2) {
                System.out.print(array[array.length - i - 1] + " ");
            }
            if (array.length - i - 2 > array.length / 2) {
                System.out.print(array[array.length - i - 2] + " ");
//
            }
        }
    }
}
