package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 21.06.2022_23:34
 */
public class Array16 {
    public static void main(String[] args) {
        int []ar={1,2,3,4,5,6,7,8,9,10,11};
        array16 (ar);
    }
    public static void array16(int[] array) {//[1,2,3,4,5,6,7,8,9,10]
        //                                      0=1=2=3=4=5=6=7=8= 9
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + " ");// i0=>1;i1=>2;i2=>3;i3=>4;
            System.out.print(array[array.length - i - 1] + " ");//i8=>9:i7=>8:i6=>7:i5=>6;
        }
        if (array.length % 2 != 0) { //true
            System.out.println(array[array.length / 2]);//i4-5;
        }
    }
}
