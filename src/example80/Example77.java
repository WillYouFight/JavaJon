package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 05.08.2022_17:40
 */
public class Example77 {
    public static void main(String[] args) {
        System.out.println(digitSum(2418));
        System.out.println(digitSum(4156));
        System.out.println(digitSum(1737));
    }
    public static int digitSum(int n) {
        int sum = 0;
        sum = n % 10;
        if (n == 0) {
            return 0;
        } else {
            return sum + digitSum(n / 10);
        }
    }
}
