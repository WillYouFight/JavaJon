package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_23:17
 */
public class Array41 {
    public static void main(String[] args) {
        int []ar={45,21,3,5,15,36,47,68,};
        array41 (ar);
    }
    public static void array41(int[] array) {
        int summax = array[0] + array[1], k = 1;
        for (int i = 2; i < array.length; i++) {
            if (array[i-1]+array[i]>summax){
                summax=array[i-1]+array[i];
                k=i;
            }
        }
        System.out.printf("%d,%d",array[k-1],array[k]);
    }
}
