package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:00
 */
public class Example17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = 8; // -10 2 9 1 -3 6 10 -11
        System.out.print("n = ");
        int n = scanner.nextInt(); // -10 -2 -9 -1 -3 -6 -10 -11
        int number, min = Integer.MAX_VALUE;
        boolean topildi = false; // musbat topilsa true bo'ladi
        for (int i = 1; i <= n; i++) {
            number = scanner.nextInt();
            if (number > 0) { // musbat
                if (min > number) min = number;
                topildi = true;
            }
        }
        if (topildi) System.out.println(min);
        else System.out.println(0);
    }
}
