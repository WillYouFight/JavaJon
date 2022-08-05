package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 22.06.2022_20:00
 */
public class Array5 {
    public static void main(String[] args) {
    solution (10);
    }
    public static void solution(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];   // 1 1 2 3 5 8 13 ....
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + "\t");
        }
    }
}
