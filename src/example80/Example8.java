package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:53
 */
public class Example8 {
    public static void main(String[] args) {
        solution(1000, 7);
    }
    public static void solution(int s, int p) {
        int k = 0;
        double sum = s;
        while (sum < 2 * s) {
            k++;
            sum = sum + sum * p / 100.0;

        }
        System.out.println(k+" oyda");
        System.out.printf("%.2f",sum);
    }
}
