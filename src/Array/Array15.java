package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 21.06.2022_22:23
 */
public class Array15 {
    public static void main(String[] args) {
        int [] r={1,2,3,4,5,6,7,8};
        array15(r);
    }
    public static void array15(int[] array){
        for (int i = 1; i < array.length; i+=2) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = array.length-2; i >=0 ; i-=2) {
            System.out.print(array[i]+" ");
        }
    }
}
