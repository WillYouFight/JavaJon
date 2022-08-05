package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:57
 */
public class Example13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE, minIndex = 0;

        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if (min > a) {    // 5 -10 2 9 30
                min = a;      // min = 5
                minIndex = i; // minIndex = 1
            }
        }
        System.out.println(min);
        System.out.println(minIndex);
    }

}
