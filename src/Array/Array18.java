package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:20
 */
public class Array18 {
    public static void main(String[] args) {
        int[] array = { 5, 1, 4,2, 1, 6, 5};
        System.out.println(solution(array));
    }
    public static int solution(int[] array) {
        int last = array[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < last) {// topildi
                return array[i];
            }
        }
        return 0;
    }
}
