package Array;

import java.util.Arrays;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_16:29
 */
public class Array63 {
    public static void main(String[] args) {
        int []a={1,2,3,4};
        int []b={5,6,7,8};
        array (a,b);
    }
    public static void array(int []a,int []b){
        int []c=new int[a.length+b.length];
        System.out.println (Arrays.toString (c));
        for (int i = 0; i < c.length; i++) {
            if ( i < a.length ){
                c[i]=a[i];
                System.out.print(c[i]+" ");
            }else{
                c[i]=b[i-a.length];
                System.out.print(c[i]+" ");
            }
        }
    }
}
