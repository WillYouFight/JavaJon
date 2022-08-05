package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 20.06.2022_22:20
 */
public class Array47 {
    public static void main(String[] args) {
        int [] array=  {1,5,3,6,4,1,5,6,2,4,3,6,5};
        solution (array);
    }
    public static void solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean mavjud = false;
            for (int j = 0; j < i; j++) {
                mavjud = mavjud || element == array[j];
            }
            if (!mavjud) {
                System.out.print(element+" " );
            }
        }
    }
}
