package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:28
 */
public class Array32 {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,4,5,6,7,8,9,10,5,11,};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            // Local minimum ->  a[i-1] > a[i] && a[i] < a[i+1]
            // Local maximum ->  a[i-1] < a[i] && a[i] > a[i+1]

//            boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
            boolean isLocalMin = array[i - 1] > array[i] && array[i] < array[i + 1];

            if (isLocalMin)
                return i;
        }
        return -1;
    }
}
