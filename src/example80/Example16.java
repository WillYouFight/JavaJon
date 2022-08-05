package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:59
 */
public class Example16 {
    public static void main(String[] args) {
        int n;
        int r;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minnum = 0;
        int maxnum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            r = scanner.nextInt();
            if ((i == 1) || (r >= max)) {
                max = r;
                maxnum = i;
            }
            if ((i == 1) || (r <= min)) {
                min = r;
                minnum = i;
            }
        }
        if (maxnum > minnum) {
            System.out.printf("%d\n", max);
            System.out.printf("%d\n", maxnum);
        } else if (minnum > maxnum) {
            System.out.printf("%d\n", min);
            System.out.printf("%d\n", minnum);
        }
    }
}
