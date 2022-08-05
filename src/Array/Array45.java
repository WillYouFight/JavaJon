package Array;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 24.06.2022_19:45
 */
public class Array45 {
    public static void main(String[] args) {
        int []ariq={3,1,19,7,6,41,35};
        abc (ariq);
    }
    public static void abc(int []array){
        //[0][1][2][3]][4][5]
        //12, 3, 65, 7 ,3, 4,  7-65=|58| === 3-4=|1|
        int min=Integer.MAX_VALUE;
        int ar1=0;
        int na=0;
        int indeks1=0,indeks2=0;
        for (int i = 1; i < array.length; i++) {
            na=Math.abs(array[i]-array[ar1]);//3-12=>9
            if ( min>na ){
                min=na;
                indeks1=i;
                indeks2=ar1;

            }
            ar1++;
        }
        System.out.print (indeks1+" va ");
        System.out.println (indeks2+" indekslari eng yaqini");
    }
}
