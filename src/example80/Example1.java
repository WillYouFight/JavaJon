package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 29.06.2022_22:02
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt(); // berilgan son
        int b = scanner.nextInt(); // berilgan son
        int c = scanner.nextInt();
        if (a <= b && a <= c) {
            System.out.println(a);

        } else if (b <= a && b <= c) {
            System.out.println( b);

        } else if (c <= a && c<= b) {
            System.out.println(c);
            // c katta a dan
        }else {
            System.out.println(a);
        }
    }
}
