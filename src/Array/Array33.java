package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 23.06.2022_14:29
 */
public class Array33 {
    public static void main(String[] args) {
        array33(new int[]{1,3,1,4,5,6,3
        });
    }
    public static void array33(int []array){
        int num;
        if (array[array.length-1]>array[array[array.length-2]]){
            System.out.println(array.length);
        }else {
            num= array.length-2;
            while ((num>=1) && !((array[num-1]<array[num] && array[num]> array[num+1]))){
                num--;
            }
            System.out.println(num);
        }
    }
}
