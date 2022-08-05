package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_21:54
 */
public class Example10 {
    public static void main(String[] args) {
        EKUB(24, 18);//6
        EKUB(40, 56);//8
        EKUB(17, 37);//1
    }
    public static void EKUB(int a, int b) {//24 va 18
        while (a != b) {
            if (a > b) {
                a %= b;
            } else b %= a;
            if (a == 0) a = b;
            if (b == 0) b = a;
        }
        System.out.println(a);
    }
}
