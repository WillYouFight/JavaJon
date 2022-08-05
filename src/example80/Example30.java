package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:08
 */
public class Example30 {
    public static void main(String[] args) {
        System.out.println (IsLeapYear (1300));
        System.out.println (IsLeapYear (2020));
        System.out.println (IsLeapYear (1900));
        System.out.println (IsLeapYear (2020));
        System.out.println (IsLeapYear (2010));
    }
    public static boolean IsLeapYear(int y) {//2020 100
        int b, d, e, c, f;
        b = y % 100;//1300 = b ==> 00
        c = y % 400;//1300-1200= c ==> 100
        f = y % 4;
        if ( b == 0 ) {
            if ( c == 0 ) {
                return true;
            } else {
                return false;
            }
        } else {
            if ( f == 0 ) {
                return true;
            } else {
                return false;
            }
        }
    }
}
