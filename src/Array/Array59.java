package Array;

import arrayUtil.ArrayUtil;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_14:24
 */
public class Array59 {
    public static void main(String[] args) {
        int []arik={2,3,5,6,7,8,9};
        ArrayUtil.show (arik);
        System.out.println ( );
        array59 (arik);
    }
    public static void array59(int[] a){//b
        int[] b =new int[a.length];//
        for (int i = 0; i < a.length; i++) {//
            for (int j = 0; j <=i; j++) {//
                b[i]+=a[j];
                //b1 =3

            }
            b[i]/=i+1;//

        }
        ArrayUtil.show(b);
    }

}
