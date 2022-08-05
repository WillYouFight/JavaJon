package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:03
 */
public class Example22 {
    public static void main(String[] args) {
        System.out.println(tub(9));
    }
    // n = 51
    // 2 3 4 5 ... 50
    public static boolean tub(int number) {
        int i = 2;//4
        while (i < number) {
            if (number % i == 0)
                return false; // tub emas
            i++;
        }
        return true; // tub
    }

}
