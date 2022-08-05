package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_23:02
 */
public class Array80 {
    public static void main(String[] args) {
        array80(new int[]{1,2,3,4,5});
    }
    public static void array80(int[]array){
        for (int i = 0; i < array.length-1 ; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1]=0;
        ArrayUtil.show(array);
    }
}
