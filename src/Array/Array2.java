package Array;

import java.util.Scanner;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 21.06.2022_21:49
 */
public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }
    public static void solution(int n) {
        int[] arr = new int[n];
        int daraja = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = daraja; // 1 2 4 8 16 32 64 ...
            daraja *= 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
