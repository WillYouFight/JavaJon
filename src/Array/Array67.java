package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_19:46
 */
public class Array67 {
    public static void main(String[] args) {
        array67(new int[]{1,2,3,4,5,6,7});//8,10,12,14
    }
    public static void array67(int []array){
        int n=0;
        for (int i = array.length-1; i >0; i--) {
            if (array[i]%2!=0){
                n=array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0) {
                array[i]+=n;
            }
        }
        ArrayUtil.show(array);
    }
}
