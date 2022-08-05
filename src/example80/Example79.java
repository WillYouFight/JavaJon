package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:41
 */
public class Example79 {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = task.nextLine();
        System.out.print("Digits: " + DigitCount(str));
    }
    static int DigitCount(String str) {
        if (str.length() == 1) {
            if (Character.isDigit(str.charAt(0))) counter++;
        } else if (Character.isDigit(str.charAt(str.length() - 1))) {
            counter++;
        }
        if (str.length() >= 2) return DigitCount(str.substring(0, (str.length() - 1)));
        return counter;
    }
}
