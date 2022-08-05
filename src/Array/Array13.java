package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 21.06.2022_22:03
 */
public class Array13 {
    public static void main(String[] args) {
        int []r= {1,2,3,4,5,6,7,8,9,10};
        //        0,1,2,3,4,5,6,7,8,9
        Fine (r);
    }
    public static void Fine(int[]array ){
        for (int i = array.length-1; i > 0; i-=2) {//5
            System.out.print (array[i]+" ");
        }
    }
}
