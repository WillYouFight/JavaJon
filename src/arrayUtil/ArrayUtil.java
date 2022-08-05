package arrayUtil;

import java.util.Random;

/**
 * project : Array
 * package : arrayUtil
 * author  : Allamuradov Tal'at
 * date    : 26.06.2022_14:21
 */
public class ArrayUtil {
    public static void show(int[] array) {
        for (int item : array) {
            // i-elementni tanlab beradi
            System.out.print(item + "\t");
        }
        System.out.println();
    }

    // massivni 1 ... n sonlari bilan to'ldiradi
    // 1,2,3,4,5,6,...,n
    public static int[] generate(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // massivni 1 ... n sonlari bilan to'ldiradi
    // ayirmasi d, dastlabki hadi first bo'lgan arifmetik progressiya generatsiya qiladi
    public static int[] generateArifProg(int n, int first, int d) {
        int[] array = new int[n];
        array[0] = first;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }


    // [0,100) oraliqdagi random sonlari bilan to'ldiradi
    public static int[] generateRand(int n) {
        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
