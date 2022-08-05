package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 25.06.2022_16:18
 */
public class Array49 {
    public static void main(String[] args) {
        //         0,1,2,3,4,5
        int []ar1={1,3,5,2,5,61};//
        int []ar2={1,3,5,7,5,6};//
        System.out.println (Lug (ar1));
        System.out.println (Lug (ar2));
    }
    public static int Lug(int []array){
        int natija=0;
        for (int i = 0; i < array.length; i++) {
            if ( array.length<array[i] ){
                natija=i;
                return natija;
            }
        }
        return natija;
    }
}

