package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_17:53
 */
public class Array38 {
    public static void main(String[] args) {
        monotonEncirment(new int[]{9,3,4,2,3,4,1});
    }
    public static void monotonEncirment(int[] array) {
        int num=0;
        for (int i = 2; i < array.length; i++) {
            if ((array[i-2]>array[i-1]) && !(array[i-1]>array[i])){
                num++;
            }
        }
        if (array[array.length-2]>array[array.length-1]){
            ++num;
        }
        System.out.println(num);
    }
}
