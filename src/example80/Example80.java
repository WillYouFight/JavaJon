package example80;

import java.util.Locale;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:42
 */
public class Example80 {
    public static void main(String[] args) {
        System.out.println(Palindrome("kiyeik"));
        System.out.println(Palindrome("Noon"));
    }
    static boolean Palindrome(String str) {
        if (str.length() <= 1) return true;
        else {
            if (str.toLowerCase(Locale.ROOT).charAt(0) == str.toLowerCase(Locale.ROOT).charAt(str.length() - 1))
                return Palindrome(str.substring(1, str.length() - 1));
            else return false;
        }
    }
}
