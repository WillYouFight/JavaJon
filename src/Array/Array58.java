package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:04
 */
public class Array58 {
    public static void main(String[] args) {
        array(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14});
    }
    public static void array(int[]array){
        int[] array2 =new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i]=0;
            for (int j = 0; j <=i; j++) {
                array2[i]+=array[j];
            }
        }
        ArrayUtil.show(array2);

    }

}
