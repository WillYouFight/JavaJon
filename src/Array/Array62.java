package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:11
 */
public class Array62 {
    public static void main(String[] args) {
        incDec (new int[]{1,-2,-3,4,-4,5,6,-1,-5});
    }
    public static void incDec(int[] a) {
        int counterB = 0;
        int counterC = 0;
        for (int i = 0; i < a.length; i++) {
            if ( a[ i ] > 0 ) {
                counterB++;//4
            } else if ( a[ i ] < 0 ) {
                counterC++;//4
            }
        }
        System.out.println (counterB);
        System.out.println (counterC);
        int[]b=new int[a.length-counterC];
        int[]c=new int[a.length-counterB];
        int g1=0;
        int g2=0;
        for (int i = 0; i < counterB+counterC; i++) {//{1,-2,-3,4,-4,5,6,-1,-5}
            if ( a[ i ] > 0 ) {//i0=T//i3=T//
                b[ g1++ ] = a[ i ];//b0=1//b3=4
            } else if (a[i]<0) {
                c[g2++]=a[i];//i1=-2//i2=-3//
            }
        }
        ArrayUtil.show (b);
        System.out.println ( );
        System.out.println ("Array b size: " + counterB);
        ArrayUtil.show (c);
        System.out.println ( );
        System.out.println ("Array c Size: " + counterC);
    }
}
