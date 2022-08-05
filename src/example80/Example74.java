package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:38
 */
public class Example74 {
    public static void main(String[] args) {
        System.out.println(fib(15));
        System.out.println(fib(16));
        System.out.println(fib(17));
        System.out.println(count);
    }
    static int count = 0;
    public static int fib(int n) {
        count++;
        if (n == 0) return 1;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
