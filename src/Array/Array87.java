package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:40
 */
public class Array87 {
    public static void main(String[] args) {
        array87(new int[]{5,2,3,4,5,6,7,8,9});
    }
    public static void array87(int[]array){
        for (int i = 1; i < array.length; i++) {
            if (array[i-1]>array[i]){
                array[i-1]+=array[i];
                array[i]=array[i-1]-array[i];
                array[i-1]=array[i-1]-array[i];
            }else break;
        }
        ArrayUtil.show(array);
    }
}
