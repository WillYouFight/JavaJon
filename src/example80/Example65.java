package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:35
 */
public class Example65 {
    public static void main(String[] args) {
        int[] array ={4,8,3,5,7,9};
        System.out.println(MinElement(array));
    }
    public static int MinElement(int[]a  ){
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i]<min){
                min =a[i];
            }
        }
        return min;
    }
}
