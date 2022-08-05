package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_19:58
 */
public class Example33 {
    public static void main(String[] args) {
        System.out.println (nextDate (28, 2, 2020));//1 3 2020
        System.out.println (nextDate (28, 2, 2021));//1 3 2020
        System.out.println (nextDate (28, 2, 2022));//1 3 2020
        System.out.println (nextDate (28, 2, 2023));//1 3 2020
    }
    public static String nextDate(int d, int m, int y) {
        if ( !kunMavjud (d, m, y) ) return "Bunday kun mavjud emas";//true
        if ( d == 31 && m == 12 ) {
            return String.format ("%d/%d/%d", 1, 1, y + 1);
        } else if ( d == 28 && m == 2 ) {
            if ( !isKabisa (y) ) return String.format ("%d/%d/%d", 1, m + 1, y);
            else return String.format ("%d/%d/%d", d + 1, m, y);
        } else if ( d == 30 && (m == 4 || m == 6 || m == 9 || m == 11) )
            return String.format ("%d/%d/%d", 1, m + 1, y);
        else if ( d == 31 && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) ) {
            return String.format ("%d/%d/%d", 1, m + 1, y);
        } else return String.format ("%d/%d/%d", d + 1, m, y);
    }
    public static boolean kunMavjud(int d, int m, int y) {//2020
        if ( d <= 0 || d >= 32 ) return false;
        if ( m <= 0 || m >= 13 ) return false;//
        if ( y <= 0 ) return false;
        if ( d == 31 && (m == 2 || m == 4 || m == 6 || m == 9 || m == 11) ) return false;
        if ( d == 30 && m == 2 ) return false;
        if ( d == 29 && !isKabisa (y) && m == 2 ) return false;
        return true;
    }
    public static boolean isKabisa(int year) {
        if ( year % 4 != 0 ) return false;
        else if ( year % 400 == 0 ) {
            return true;
        } else return year % 100 != 0;
    }

}
