package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:53
 */
public class Example7 {
    public static void main(String[] args) {
        int n;
        int number =300;//berilgan son
        int i = 1;
        int s1 = 0;
        int s2 = 0;
        for (int k = 1;k <= number;k++)
        {
            n = k;
            while (i < n)
            {
                if (n % i == 0)
                {
                    s1 = s1 + i;
                }
                i++;
            }
            i = 1;
            if (s1 == n)
            {
                continue;
            }
            while (i < s1)
            {
                if (s1 % i == 0)
                {
                    s2 = s2 + i;
                }
                i++;
            }
            if (n == s2)
            {
                System.out.printf("%d \n",n); //fibonacii
            }
            s1 = 0;
            s2 = 0;
        }
    }
}
