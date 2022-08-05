package Matrix;

/**
 * project : Array
 * package : Matrix
 * author  : Allamuradov Tal'at
 * date    : 09.07.2022_23:31
 */
public class TestChristmasTree {
    public static void main(String[] args) {
        int a=4;
        for (int i = 1; i <= a; i++) {//
            for (int j = a*2-i; j >= 0; j--) {//5
                System.out.print ("   ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print (" * ");
            }
            System.out.println ( );
        }
    }
}
