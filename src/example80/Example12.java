package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:57
 */
public class Example12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        System.out.print("n = ");
        n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            int number = scanner.nextInt(); // i=1
            if (min > number) min = number; // min = 5
            if (max < number) max = number; // max = 5
        }
        System.out.println();
        System.out.println(min);
        System.out.println(max);
    }

}
