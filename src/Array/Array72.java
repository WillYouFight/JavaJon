package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:33
 */
public class Array72 {
    public static void main(String[] args) {
        int[]arik={1,2,3,4,5,6,7,8,9,10};
        Back (arik,3,8);
    }
    public static void Back(int[] array, int k, int h) {
        int n = array.length;
        int []a=new int[n];
        if ( 1 <= k && k < h && h<=n){
            for (int i = 0; i < n; i++) {
                a[i]=array[i];
                if ( k == i ) {//i=3
                    for (int j = h; j >= k; j--) {
                        a[i++]=array[j];
                    }
                    i--;
                }
            }
            ArrayUtil.show (a);
        }
    }
}
