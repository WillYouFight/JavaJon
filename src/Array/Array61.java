package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:12
 */
public class Array61 {
    public static void main(String[] args) {
        array61(new int[]{1,2,3,4,5,6,7,8});
    }
    public static void array61(int[] a){
        int[] b=new int[a.length];
        for (int i = 0; i < a.length; i++) {//
            for (int j = i; j < a.length; j++) {//
                b[i]+=a[j];//
            }
            b[i]/= a.length-i;
        }
        ArrayUtil.show(b);
    }

}
