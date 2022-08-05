package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:53
 */
public class Example9 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);

        System.out.print("N:");
        n = scanner.nextInt();
        int sum = 0;
        int num = 0;
        while (n > 0)
        {
            ++num;
            sum += n % 10;
            n /= 10;
        }
        System.out.print("Raqamlar soni:");
        System.out.print(num);
        System.out.print("\n");
        System.out.print("Raqamlar yig`indisi:");
        System.out.print(sum);
    }
}
