package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:20
 */
public class Array19 {
    public static void main(String[] args) {

        arraySample(new int[]{10,2,4,5,6,78,11,88});
    }
    public static void arraySample(int[] array) {
        int k = array.length - 1;
        while ((array[0] >= array[k]) || (array[k] >= array[array.length - 1]) && (k > 0)) {
            --k;
        }
        if (k == 0) System.out.println(k);
        else{
            System.out.println(array[k]);
        } }
}

