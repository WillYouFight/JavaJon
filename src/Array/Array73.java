package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_21:42
 */
public class Array73 {
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
                    i++;
                    for (int j = h-1; j >= k+1; j--) {
                        a[i++]=array[j];
                    }
                    i--;
                }
            }
            ArrayUtil.show (a);
        }
    }
}
