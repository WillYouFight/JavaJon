package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:02
 */
public class Example21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int r1 = 0;
        int r2 = 0;
        int maxsum = 0;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            r2 = r1;
            r1 = scanner.nextInt();
            if (i == 2) {
                maxsum = r2 + r1;
            }
            if (r1 + r2 > maxsum) {
                maxsum = r2 + r1;
            }
        }
        System.out.println(maxsum);
    }
}
