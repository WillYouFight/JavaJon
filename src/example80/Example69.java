package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:39
 */
public class Example69 {
    public static void main(String[] args) {
        double[] array = {9, 1, 8, 7, 6};
        show(sortedIndex(array));
    }
    public static void show(int[] array) {
        for (int j : array) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
    public static int[] sortedIndex(double[] array) {
        int[] indexArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            indexArray[i] = i;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;

                    int t1 = indexArray[j];
                    indexArray[j] = indexArray[j + 1];
                    indexArray[j + 1] = t1;
                }
            }
        }
        return indexArray;
    }
}
