package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_14:31
 */
public class Array60 {
    public static void main(String[] args) {
    int []arik={3,6,9,12,2,4};
        ArrayUtil.show (arik);
        System.out.println ( );
    array59 (arik);
}
    public static void array59(int[] a){//b
        int[] b =new int[a.length];//
        int n=a.length;
        for (int i = 0; i < a.length; i++) {//
            for (int j = 0; j < n-i; j++) {//
                b[i]+=a[j];
            }
        }
        ArrayUtil.show(b);
    }
}
