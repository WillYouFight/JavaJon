package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_11:41
 */
public class Array52 {
    public static void main(String[] args) {
        double[] array1 = {2, 4, 6, 8, 10, 12};//4=>8=>3=>4=>5=>6
        double[] array2 = {2, 5, 3, 5, 52, 70, 18, 61};
        ToBack (array1);
        System.out.println ( );
        ToBack (array2);
    }

    public static void ToBack(double[] arrayA) {
        double[] arrayB = new double[ arrayA.length ];
        for (int i = 0; i < arrayA.length; i++) {
            if ( arrayA[ i ] < 5 ) {
                arrayB[ i ] = 2 * arrayA[ i ];
                System.out.print (arrayB[ i ] + " ");
            } else {
                arrayB[ i ] = arrayA[ i ] / 2;
                System.out.print (arrayB[ i ] + " ");
            }
        }
    }
}
