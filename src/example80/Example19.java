package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:01
 */
public class Example19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int maxnum=0;
        int r;
        int max = Integer.MIN_VALUE;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            r = scanner.nextInt();
            if ((r >= max) ) {
                max = r;
                maxnum = i;
            }
        }
        System.out.println(max);
        System.out.printf("%d\n", n - maxnum);
    }
}
