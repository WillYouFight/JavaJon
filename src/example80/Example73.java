package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:38
 */
public class Example73 {
    public static void main(String[] args) {
        int fact = fact2(5);
        System.out.println(fact);
    }
    public static int fact2(int n) {
        if (n==2) return 2;
        if (n==1) return 1;
        return n * fact2(n - 2);
    }
}
