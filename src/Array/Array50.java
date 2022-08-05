package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 25.06.2022_16:42
 */
public class Array50 {
    public static void main(String[] args) {
        int []ar1={1,3,5,2,5,61};
        int []ar2={1,3,5,2,5,61,4,3,2,5,6};
        ongBag (ar1);
        ongBag (ar2);
    }
    public static void ongBag(int [] Massiv ){
        int cotrMontr=0;
        for (int i = 1; i < Massiv.length-1; i++) {
            if ( Massiv[i-1]>Massiv[i] ){
                cotrMontr++;
            }
        }
        System.out.println (cotrMontr);
    }
}
