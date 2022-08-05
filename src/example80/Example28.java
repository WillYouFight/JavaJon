package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:07
 */
public class Example28 {

    public static void main(String[] args) {
        EKUB (24,18,30);
        EKUB (40,56,72);
        EKUB (17,37,15);
    }
    public static void EKUB(int a, int b, int c) {//24 va 18
        int max = Integer.MIN_VALUE;//-2.000.000.
        int t, m = 0, e = 0;
        int tb, mb = 0;
        int tc, mc = 0;
        for (int i = 1; i <= a; i++) {
            t = a % i;//24%3=0
            if ( t == 0 ) {
                m = i;
            }
            for (int j = 1; j <= b; j++) {
                tb = b % j;//
                if ( tb == 0 ) {
                    mb = j;
                }
                for (int k = 1; k <= c; k++) {
                    tc = c % k;
                    if ( tc == 0 ) {
                        mc = k;
                    }
                    if ( m == mb && mb == mc ) {
                        e = m;
                    }
                    if ( max < e ) {
                        max = e;
                    }
                }
            }
        }
        System.out.println (max);
    }

}
