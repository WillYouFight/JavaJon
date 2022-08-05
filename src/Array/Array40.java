package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_22:11
 */
public class Array40 {
    public static void main(String[] args) {
        int []ar={45,21,3,5,15,36,47,68,};
        System.out.println (solution (ar, 2));
    }
    public static int solution(int[] array, int r) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int element : array) { // a[0],a[1],a[2]...
            if (min > Math.abs(r - element)) {
                min = Math.abs(r - element);
                result = element;
            }
        }
        return result;
    }
}

