package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:36
 */
public class Example67 {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 3, 1, 2, 5, 6, 2, 3, 2, 4, 2};
        show(array);
        array = removeX(array, 2);
        show(array);
    }
    public static void show(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
    public static int[] removeX(int[] array, int x) {
        int counter = 0;
        for (int item : array) {
            if (item != x) counter++;
        }
        int[] newArray = new int[counter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
