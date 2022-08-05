package Array;

import arrayUtil.ArrayUtil;

import java.util.Arrays;

/**
 * project : Array
 * package : Array
 * author  : Allamuradov Tal'at
 * date    : 10.07.2022_22:45
 */
public class Array97 {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 2, 1, 3, 4,3, 1};
        System.out.println (con (ar));
        System.out.print (Arrays.toString (last (ar)));
        System.out.println ( );
        System.out.print (Arrays.toString (back (ar)));
        System.out.println ( );
        System.out.print (Arrays.toString (ton (ar)));
        System.out.println ( );
        System.out.print (Arrays.toString (bubbleSort (ar)));
        System.out.println ( );
        array97 (ar);
    }
    public static void array97(int []array){
        for (int i = 0; i < bubbleSort (array).length; i++) {
            System.out.print ( array[bubbleSort (array)[i]]+" ");
        }
    }
    public static int[]bubbleSort(int[]array){
        int []arrays=ton (array);
        for (int i = arrays.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int t = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = t;
                }
            }
        }
        return arrays;
    }
    public static int[] ton(int[] array) {
        int []arik=new int[array.length-con (array)];
        int caunt=0;
        for (int i = 0; i < array.length; i++) {
            if ( back (array)[i]!=0){
                arik[caunt++]=back (array)[i];
            }
        }
        return arik;
    }
    public static int[] back(int[] array) {
        int[] arik = new int[ array.length ];
        int[] arin = last (array);
        int big = 0;
        for (int i = 0; i < arin.length; i++) {
            boolean mavjud = false;
            int element = arin[ i ];
            for (int j = 0; j < i; j++) {
                if ( element == arin[ j ] ) {
                    mavjud = true;
                }
            }
            if ( !mavjud ) {
                arik[ i ] = element;
            }
        }
        return arik;
    }
    public static int[] last(int[] array) {
        int[] arrayCopy = new int[ array.length ];
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            element = array[ i ];
            for (int j = 1; j < array.length; j++) {
                if ( element == array[ j ] ) {
                    arrayCopy[ i ] = j;
                }
            }
        }
        return arrayCopy;
    }
    public static int con(int[] array) {//{1, 2, 1, 3, 4, 3, 1}
        int element = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            element = array[ i ];//1
        }
        for (int i = 0; i < array.length; i++) {
            if ( element == array[ i ] ) {
                counter++;//1
            }
        }
        return counter;
    }
}
