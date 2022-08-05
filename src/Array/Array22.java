package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:23
 */
public class Array22 {
    public static void main(String[] args) {
        array22(1,4,new int[]{1,2,3,4,5,6,7});
    }
    public static void array22(int k, int l, int[] array) {
        int sum=0;
        for (int i = 0  ; i <k; i++) {
            sum+=array[i];
        }
        for (int j = l+1; j < array.length ; j++) {
            sum+=array[j];
        }
        System.out.println(sum);
    }
}

