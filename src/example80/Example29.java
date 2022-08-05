package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:08
 */
public class Example29 {
    public static void main(String[] args) {
        // 12 18 24 36 ...
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ekub = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int second = scanner.nextInt();
            ekub = ekub(ekub, second); // 6
        }
        System.out.println(ekub);
    }

    public static int ekub(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

}
