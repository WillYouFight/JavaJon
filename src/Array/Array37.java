package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:31
 */
public class Array37 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        int[] array1 = {1,2,3,4,5,2,3,4,5,9,6,8,5,1,2,3};
       //5
        System.out.println(solution(array));
        System.out.println(solution(array1));
    }
    public static int solution(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (i != array.length - 1) {
                boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
                if (isLocalMax) {
                    counter++;
                }
            } else {
                if (array[i] > array[i - 1]) counter++;
            }
        }
        return counter;
    }
}
