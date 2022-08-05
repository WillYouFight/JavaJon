package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:35
 */
public class Array83 {
    public static void main(String[] args) {
        array83(new int[]{1,2,3,4,5,6,7,8,9,10,11});
    }
    public static void array83(int []array ){
        int a0= array[array.length-1];
        for (int i = array.length-1; i >=1; --i) {
            array[i]=array[i-1];
        }
        array[0]=a0;
        ArrayUtil.show(array);
    }
}
