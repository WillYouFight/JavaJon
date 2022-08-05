package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_23:20
 */
public class Array43 {
    public static void main(String[] args) {
        int []ar={45,21,3,5,15,36,47,68,};
        array43 (ar);
    }
    public static void array43(int[]array){
        int num =1;
        for (int i=1; i< array.length; ++i) {
            num++;
        }
        System.out.println(num);
    }
}
