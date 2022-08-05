package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:58
 */
public class Example14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = scanner.nextInt();
        int minIndex = 1;
        int max = min;
        int maxIndex = 1;
        for (int i = 2; i <= n; i++) {
            int number = scanner.nextInt();
            if (min > number) {
                min = number;
                minIndex = i;
            }
            if (max <= number) {
                max = number;
                maxIndex = i;
            }
        }
        System.out.printf("%d %d; %d %d", min, minIndex, max, maxIndex);
    }
}
