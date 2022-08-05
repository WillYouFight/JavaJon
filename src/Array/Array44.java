package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_19:19
 */
public class Array44 {
    public static void main(String[] args) {
        solution(new int[]{3,4,2,3,4});//
    }
    public static void solution(int[]arrey) {
        for(int i=0; i<arrey.length; i++){//i0=5....i9=6
            for (int j = i+1; j < arrey.length; j++) {
                if ( arrey[i]==arrey[j] ){
                    System.out.println (i+"="+j );
                    System.out.println ( );
                }
            }
        }
    }
}
