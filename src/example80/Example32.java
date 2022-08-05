package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:09
 */
public class Example32 {
    public static void main(String[] args) {
        System.out.println(prevDay(1, 3, 2020));
        System.out.println(prevDay(31, 3, 2020));
        System.out.println(prevDay(29, 2, 2020));
        System.out.println(prevDay(29, 2, 2019));
    }
    // 1 3 2020
    public static String prevDay(int d, int m, int y) {
        if (!kunMavjud(d, m, y)) return "Bunday kun mavjud emas";
        if (d == 1 && m == 3) {
            if (isKabisa(y)) return String.format("%d/%d/%d", 29, 2, y);
            else return String.format("%d/%d/%d", 28, 2, y);
        } else if (d == 1 && m == 1) {
            return String.format("%d/%d/%d", 31, 12, y - 1);
        } else if (d == 1 && (m == 2 || m == 4 || m == 6 || m == 9 || m == 11))
            return String.format("%d/%d/%d", 31, m - 1, y);
        else if (d == 1 && (m == 5 || m == 7 || m == 10 || m == 12)) {
            return String.format("%d/%d/%d", 30, m - 1, y);
        } else if (d == 1 && m == 8) return String.format("%d/%d/%d", 31, 7, y);
        else return String.format("%d/%d/%d", d - 1, m, y);
    }
    public static boolean kunMavjud(int d, int m, int y) {
        if (d <= 0 || d >= 32) return false;
        if (m <= 0 || m >= 13) return false;
        if (y <= 0) return false;
        if (d == 31 && (m == 2 || m == 4 || m == 6 || m == 9 || m == 11)) return false;
        if (d == 30 && m == 2) return false;
        if (d == 29 && !isKabisa(y) && m == 2) return false;

        return true;
    }
    public static boolean isKabisa(int year) {
        if (year % 4 != 0) return false;
        else if (year % 400 == 0) {
            return true;
        } else return year % 100 != 0;
    }
}
