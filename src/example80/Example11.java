package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:56
 */
public class Example11 {
    public static void main(String[] args) {
        masala11(24,6);//0 4
        masala11(42,8);//2 5
        masala11(56,10);//6 5
        masala11(12,3);//0 4
    }
    public static void masala11(int a, int b) {
        int count = 0;
        while (a>=b){
            a-=b;
            count++;
        }
        System.out.printf("%d %d ",a,count);
        System.out.println();
    }
}
