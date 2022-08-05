package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:06
 */
public class Example27 {

    public static void main(String[] args) {
        EKUK (24, 18);
        EKUK (40, 56);
        EKUK (17, 37);
    }
    public static int EKUB(int a,int b){//24 va 18
        int max=Integer.MIN_VALUE;//
        int t,m=0,e=0;
        int tb,mb=0;
        for (int i = 1; i <= a; i++) {
            t=a%i;//
            if (t==0){
                m=i;
            }
            for (int j = 1; j <=b ; j++) {
                tb=b%j;//
                if ( tb==0 ){
                    mb=j;
                }
                if ( m==mb ){
                    e=m;
                }
                if (max<e ){
                    max=e;
                }
            }
        }
        return max;//max=>18
    }
    public static void EKUK(int g,int h){
        int p=g*h/EKUB (g,h);
        System.out.println (p);
    }
}
