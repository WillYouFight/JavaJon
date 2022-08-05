package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:04
 */
public class Example25 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(23332));
    }
    public static boolean isPalindrome(int n) {//101
        int num = n; //
        int temp;
        int reverseNum = 0;
        for (; num != 0; ) {
            temp = num % 10;
            reverseNum = reverseNum * 10 + temp;
            num = num / 10;
        }
        if (n == reverseNum) return true;
        else return false;
    }

}
