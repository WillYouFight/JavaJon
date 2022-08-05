package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:40
 */
public class Example76 {
    public static void main(String[] args) {
        System.out.println(EKUb(24, 18));
        System.out.println(EKUb(40, 56));
        System.out.println(EKUb(17, 37));
    }
    public static int EKUb(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) a = a % b;
        else b = b % a;
        return EKUb(a, b);
    }
}
