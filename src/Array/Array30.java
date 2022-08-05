package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:27
 */
public class Array30 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,5,7,33,12};
        solution(array);
    }
    public static void solution(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.print(array[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
