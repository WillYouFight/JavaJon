package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:03
 */
public class Array57 {
    public static void main(String[] args) {
        array57(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14});
    }
    public static void array57(int[]array){
        int counter=0;
        int[] array2 =new int[array.length];
        for (int i = 0; i < array.length; i+=2) {
            array2[counter]=array[i];
            counter++;
        }
        for (int i = 1; i < array.length; i+=2) {
            array2[counter]=array[i];
            counter++;
        }
        System.out.println("Array Size: "+counter);
        ArrayUtil.show(array2);
    }
}
