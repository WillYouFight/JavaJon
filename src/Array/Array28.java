package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:26
 */
public class Array28 {
    public static void main(String[] args) {
        System.out.println(array28(new int[]{44, 1, 5,3,12,6,9}));
        System.out.println(array28(new int[]{44, 1, 5,3,12,6,1}));
    }
    public static int array28(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i += 2) {
            if(array[i]<min) min=array[i];
        }
        return min;
    }
}
