package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_19:49
 */
public class Array70 {

    public static void main(String[] args) {
        array70(new int[]{1,2,3,4,5,6,7,8});
    }
    public static void array70(int []array){
        for (int i = 0; i < array.length/2; i++) {
            array[i]+=array[array.length/2+i];//i1 =5
            array[array.length/2+i]=array[i]-array[array.length/2+i];//i5=1-5 =-4
            array[i]=array[i]-array[array.length/2+i]; //i1 =5-(-4)
        }
        ArrayUtil.show(array);
    }
}
