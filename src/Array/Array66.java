package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_19:46
 */
public class Array66 {
    public static void main(String[] args) {
        array66(new int[]{1,2,3,4,5,6,7,8});//
    }
    public static void array66(int[] array){
        int index=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                index=array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                array[i]+=index;
            }
        }
        ArrayUtil.show(array);
    }
}
