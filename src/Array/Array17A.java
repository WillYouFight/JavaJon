package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_16:22
 */
public class Array17A {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};//12/2=5.5=5
        array17 (ar);
    }

    public static void array17(int[] array) {
        int g=0;
        for (int i = 0; i < array.length / 2; i += 2) {//1
            System.out.print (array[ i ] + " ");//in0=1
            System.out.print (array[ i + 1 ] + " ");//in1=2
            if ( array.length/2>i+1 ){
                System.out.print(array[array.length-i-1]+  " ");
                System.out.print (array[array.length-i-2]+ " ");
            }
        }
        if (array.length%4==3){//
            g++;
            System.out.print (array[array.length/2+1]+" " );
        } else if (array.length %2==1 && g==0 ){
            System.out.print (array[array.length/2]+" " );
        }
    }
}
