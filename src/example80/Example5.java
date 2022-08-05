package example80;

import java.util.Scanner;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_18:50
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sonni kiriting :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (perfect(i))
                System.out.println(i);
        }
    }
    public static boolean perfect(int num)
    {
        int sum=0;
        for(int i=1;i<num; i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
