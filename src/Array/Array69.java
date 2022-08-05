package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_19:47
 */
public class Array69 {
    public static void main(String[] args) {
        array69(new int[]{-5,2,3,4,5,6,-3,2});
    }
    public static void array69(int[] array){
        for (int i = 1; i < array.length; i+=2) {
            array[i]+=array[i-1];//1+2=3
            array[i-1]=array[i]-array[i-1];//i0 =3-1=2
            array[i]=array[i]-array[i-1]; //i1 =3-2=1
        }
        ArrayUtil.show(array);
    }
}
