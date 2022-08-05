package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:03
 */
public class Example23 {
    public static void main(String[] args) {
        System.out.println(DigitCount(12345));
        System.out.println(DigitCount(123000));
        System.out.println(DigitCount(1200));
        System.out.println(DigitCount(10120));
    }
    public static int DigitCount(int k){
        int count=1;
//        k=k*10;
        for (int i = 0; i <= k ; i++) {// 1234
            k/=10;
            count++;
        }
        return  count;
    }

}
