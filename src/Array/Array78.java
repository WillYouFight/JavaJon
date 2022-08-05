package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_23:00
 */
public class Array78 {
    public static void main(String[] args) {
        array78(new int[]{1,2,3,4,5,3,2,5,6,7,8,9,1,3,2,4,3});
    }
    public static void array78(int []array){
        int ai1= 0;
        int ai =array[0];
        array[0]=(ai+array[1])/2;
        for (int i = 1; i < array.length-1; i++) {
            ai1 =ai;
            ai =array[i];
            array[i]=(ai1+ai+array[i+1])/3;
        }
        array[array.length-1]=(array[array.length-1]+ai)/2;
        ArrayUtil.show(array);
    }
}
