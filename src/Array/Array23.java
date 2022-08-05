package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:23
 */
public class Array23 {
    public static void main(String[] args) {
        array23(1,4,new int[]{1,2,3,4,5,6,7});
    }
    public static void array23(int k, int l, int[] array) {
        int sum=0;
        double sol;
        for (int i = 0; i < k; i++) {
            sum+=array[i];
        }
        for (int i = l+1; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println(sum);
        sol=(double) sum/(k+(array.length)-l);
        System.out.println(sol);
    }
}

