package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:21
 */
public class Array20 {
    public static void main(String[] args) {

        array20(2,4,new int[]{1,2,3,4,5,6,7,8});//3+4+5 =12
    }
    public static void array20(int k, int l, int[] array) {
        int sum=0;
        for (int i = k; i <=l ; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
    }
}

