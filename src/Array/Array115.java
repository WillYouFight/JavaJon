package Array;

import arrayUtil.ArrayUtil;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 29.06.2022_18:50
 */
public class Array115 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sorting(new int[]{7, 3, 6, 2})));
        int[]a={7, 3, 6, 2};
        ArrayUtil.show (sorting (a));
        //7,3,6,2
        //0,1,2,3

        //3,1,2,0
        //2,3,6,7
    }
        //7,3,6,2
    public static int[] sorting(int[] a) {
        int[] b = new int[a.length];//a.length==>4
        //a[0]=7;a[1]=3;a[2]=6;a[3]=2;
        for ( int i = 0; i < a.length; i++) {//i=0;i=1;i=2;i=3;
            b[i] = i;//b[0]=0;b[1]=1;b[2]=2;b[3]=3;
        }
        for (int i = 0; i < a.length ;i++) {//i=3;
            for (int j = 0; j < a.length - i - 1; j++) {//j=0;0=>4-3-1=0
                if (a[b[j]] > a[b[j+1]]) {//a[1]=3 > a[3]=2;
                    b[j]+=b[j+1];//b[0]=4;
                    b[j+1]=b[j]-b[j+1];//b[1]=1;
                    b[j]-=b[j+1];//3;
                }
            }//b[0]=3;b[1]=1;b[2]=2;b[3]=0;
        }
        return b;
    }
}
