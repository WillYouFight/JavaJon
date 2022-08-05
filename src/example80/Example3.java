package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:48
 */
public class Example3 {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;
        int x1 = x;
        int y1 = y;
        if (x > y) {
            x = x1 * y1 * 2;
            y = (x1 + y1) / 2;
        } else if (x < y) {
            y = x1 * y1 * 2;
            x = (x1 + y1) / 2;
        }
        System.out.println(x);
        System.out.println(y);
    }
}
