package Array;

import arrayUtil.ArrayUtil;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:49
 */
public class Array64 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int []b={5,6,7,8};
        int []c={9,10,11,12};
        ArrayUtil.show (a);
        System.out.println ( );
        ArrayUtil.show (b);
        System.out.println ( );
        ArrayUtil.show (c);
        System.out.println ( );
        array (a,b,c);
    }
    public static void array(int []a,int []b,int []c){
        int []d=new int[a.length+b.length+c.length];
        for (int i = 0; i < d.length; i++) {
            if ( i < a.length ){
                d[i]=a[i];
                System.out.print(d[i]+" ");
            } else if (i>a.length && i<(a.length+b.length) ) {
                d[i]=b[i-a.length];
                System.out.print(d[i]+" ");
            } else if (i>(a.length+b.length) ) {
                d[i]=c[i-(a.length+b.length)];
                System.out.print (d[i]+" ");
            }
        }
    }
}
