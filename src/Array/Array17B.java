package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:14
 */
public class Array17B {
    public static void main(String[] args) {

        solution(new int[]{1,2,3,4,5});
        System.out.println();
    }
    public static void solution(int[] array) {//5
        for (int i = 0; i < array.length / 2 + 1; i += 2) {//3
            System.out.print(array[i] + " ");//i0 =1;i2=3;
            if (array.length / 2 > i) {//i=0;arleng=2;true;i=2;false
                System.out.print(array[i + 1] + " ");//i+1=i1;
            }
            if (array.length - i - 1 > array.length / 2) {//true;false
                System.out.print(array[array.length - i - 1] + " ");//i4=5;
            }
            if (array.length - i - 2 > array.length / 2) {//true;false
                System.out.print(array[array.length - i - 2] + " ");//i3=4;

            }
        }
    }
}

