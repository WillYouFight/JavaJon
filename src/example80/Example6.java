package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_18:53
 */
public class Example6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Sonni kiriting: ");
        int son = scanner.nextInt();
        boolean isPrime ;
        for (int i = 1; i <= son; i++) {//1//2//3//4//5//6//7//8//9//10
            isPrime = i != 1;//
            for (int j = 2; j < i ; j++) {//5
                if ( i % j == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i+"");
            }
        }
    }
}
