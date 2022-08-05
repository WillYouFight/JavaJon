package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 21.06.2022_21:51
 */
public class Array12 {
    public static void main(String[] args) {
        int []r= {1,2,3,4,5,6,7,8,9};
        Fine (r);
    }
    public static void Fine(int[]array ){
        for (int i = 0; i < array.length; i+=2) {
            System.out.print (array[i]+" ");
        }
    }
}
