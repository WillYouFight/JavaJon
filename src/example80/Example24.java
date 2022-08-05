package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:04
 */
public class Example24 {
    public static void main(String[] args) {
        System.out.println (DigitN (12345, 7));
        System.out.println (DigitN (123987, 4));
        System.out.println (DigitN (10120, 5));
    }
    public static int DigitN( int k,int n) {//n=3
        int count = 0;
        int g=0,y=-1,u=0;
        for (int temp = k; temp != 0; temp = temp / 10) {//k=8975
            count++;
        }
        for (int i = count; i >= 1; i--) {//1//2
            u=k;//u=8975//u=897//u=89//u=8===
            k=u/10;//k=897//k=89//8===
            g=u%10;//g=5//g=7//g=9//g=8===
            if ( i==n ){//g=5!=n=7//g=7==n=7
                y=g;//7
            }
        }
        return y;
    }
}
