package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_17:55
 */
public class Array39 {
    public static void main(String[] args) {
        int []ariqdi={1,2,3,4,3,2,1,5,6,7,5,4,3,2,1,3,4,5,6,7};
        System.out.println (Monson (ariqdi));
    }
    public static int Monson(int []arik){
      int ko= Monkop (arik);
      int ka=Mobkam (arik);

      return ko+ka;
    }
    public static int Monkop(int[] array) {
        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (i != array.length - 1) {
                boolean isLocalMax = array[i - 1] < array[i] && array[i] > array[i + 1];
                if (isLocalMax) {
                    counter++;
                }
            } else {
                if (array[i] > array[i - 1]) counter++;
            }
        }
        return counter;
    }
    public static int Mobkam(int[] array) {
        int num=0;
        for (int i = 2; i < array.length; i++) {
            if ((array[i-2]>array[i-1]) && !(array[i-1]>array[i])){
                num++;
            }
        }
        if (array[array.length-2]>array[array.length-1]){
            ++num;
        }
        return num;
    }
}
