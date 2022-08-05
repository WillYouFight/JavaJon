package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:08
 */
public class Example31 {
    public static void main(String[] args) {
        MonthDay(2020,2);
        MonthDay(2020,11);
        MonthDay(2020,12);
        MonthDay(2019,2);
        MonthDay(2019,6);
        MonthDay(2019,7);
    }
    public static void MonthDay(int y,int m) {
        int b, c, f;
        b = y % 100;//1300 = b ==> 00
        c = y % 400;//1300-1200= c ==> 100
        f = y % 4;
        if ( b == 0 ) {
            if ( c == 0 ) {
                switch (m){
                    case 1,3,5,7,8,10,12-> System.out.println ((m=31)+" kun");
                    case 2-> System.out.println ((m=29)+" kun");
                    case 4,6,9,11-> System.out.println ((m=30)+" kun");
                }
            } else {
                switch (m){
                    case 1,3,5,7,8,10,12-> System.out.println ((m=31)+" kun");
                    case 2-> System.out.println ((m=28)+" kun");
                    case 4,6,9,11-> System.out.println ((m=30)+" kun");
                }
            }
        } else {
            if ( f == 0 ) {
                switch (m){
                    case 1,3,5,7,8,10,12-> System.out.println ((m=31)+" kun");
                    case 2-> System.out.println ((m=29)+" kun");
                    case 4,6,9,11-> System.out.println ((m=30)+" kun");
                }
            } else {
                switch (m){
                    case 1,3,5,7,8,10,12-> System.out.println ((m=31)+" kun");
                    case 2-> System.out.println ((m=28)+" kun");
                    case 4,6,9,11-> System.out.println ((m=30)+" kun");
                }
            }
        }
    }

}
