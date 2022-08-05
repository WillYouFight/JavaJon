package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:12
 */
public class Example36 {
    public static void main(String[] args) {
        masala36(new int[]{1,3,2,4,6,5,9,1});
        masala36(new int[]{1,11,2,4,6,5,9,1,});
    }
    public static void masala36(int []array){
        int min=Integer.MAX_VALUE;
        for (int i = 1; i < array.length-1; i++) {
            if ((array[i-1]<array[i]) && (array[i]>array[i+1])){
                if (array[i]<min){
                    min=array[i];
                }
            }
        }
        System.out.println(min);
    }
}
