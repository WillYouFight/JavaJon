package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:37
 */
public class Array85 {
    public static void main(String[] args) {
        array85(new int[]{1,2,3,4,5,6,7,8,9},4);
    }
    public static void array85(int[]array,int k){
        for (int i = 0; i <=k; i++) {
            int a0= array[array.length-1];
            for (int j = array.length-1; j > 0; --j) {
                array[j]=array[j-1];
            }
            array[0]=a0;
        }
        System.console();
        ArrayUtil.show(array);
    }
}
