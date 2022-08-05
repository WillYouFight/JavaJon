package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:39
 */
public class Example75 {

    static int[] term = new int[21];
    public static void main(String[] args) {
        term[0] = 1;
        term[1] = 1;
        System.out.println(fib2(5));
        System.out.println(count);
    }
    static int count = 0;
    static int fib2(int n) {//1
        count++; //  5
        // base case//
        if (n == 1)
            return term[1];
        if (n == 0)
            return term[0];
        if (term[n] != 0)
            return term[n];
        else {
            term[n] = fib2(n - 1) + fib2(n - 2);//4+(3+(2+(1+1)
            return term[n];
        }
    }
}
