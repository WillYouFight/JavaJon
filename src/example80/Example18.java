package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:00
 */
public class Example18 {
    public static void main(String[] args) {
        int n;
        int r;
        int max = Integer.MIN_VALUE;
        int maxnum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; ++i) {
            r= scanner.nextInt();
            if ((r % 2 != 0 && r > max) ) {
                max = r;
                maxnum = i;
            }
        }
        if (maxnum==0){
            System.out.println(0);
        }else {
            System.out.printf(" %d", max);
            System.out.printf(" %d", maxnum);
        }
    }
}
