package example80;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:56
 */
public class test {
    public static void main(String[] args) {
        int[] array = ArrayUtil.generate(13382);
        int a = sum(array);
        System.out.println(a);
    }

    public static int sum(int[] array) {
        if (array.length == 1) return array[0];
        int[] a = new int[array.length - 1];
        System.arraycopy(array, 1, a, 0, array.length - 1);
        return array[0] + sum(a); //2+sum(5,...)
        //2+5+sum(6,...)
    }
}
