package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 02.08.2022_21:54
 */
public class Example72 {
    public static void main(String[] args) {
        int fact = fact(45); // 120
        System.out.println(fact);
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact(n - 1);
    }

}
