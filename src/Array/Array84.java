package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:36
 */
public class Array84 {

    public static void main(String[] args) {
            array84(new int[]{1,2,3,4,5,6,7,8});
        }
        public static void array84(int[]array){
            int a0= array[0];
            for (int i = 0; i < array.length-1; ++i) {
                array[i]=array[i+1];
            }
            array[array.length-1]=a0;
            ArrayUtil.show(array);
        }
    }
