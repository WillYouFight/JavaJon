package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:37
 */
public class Example68 {
    public static void main(String[] args) {
    int[] array = {1, 2, 3, 1, 5};
//    int[] array1 = {1, 5, 6, 2, 3, 1, 2, 5, 6, 2, 3, 2, 4, 2};
    show(array);
    array = doubleX(array, 1);
    show(array);
}

    public static void show(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
    public static int[] doubleX(int[] array, int x) {
        int counter = 0;
        for (int item : array) {
            if (item == x) counter++;
        }
        int[] newArray = new int[array.length + counter];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            newArray[index++] = array[i];
            if (array[i] == x) {
                newArray[index++] = array[i];
            }
        }
        return newArray;
    }

}
