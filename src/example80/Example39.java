package example80;

import arrayUtil.ArrayUtil;

import java.util.Random;
import java.util.RandomAccess;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 12.07.2022_22:23
 */
public class Example39 {
    public static void main(String[] args) {
        Numbers(9,10);

    }
    static public void Numbers(int n,int m){
        if (m<=n){
            System.out.println("Bunday savol mavjud emas");
        }
        int[] newArray=new int[n];
        Random random=new Random();
        for (int i = 0; i < newArray.length; i++) {//i0=5;i1=4;i2=1;i3=3;
            int randomNumber;//
            do {
                randomNumber=random.nextInt(m);//5 4 1 1 1 1 3
                System.out.print(randomNumber+" ");

            }while (trueFalse(randomNumber,newArray));//false

            newArray[i]=randomNumber;
        }
        System.out.println();
        for (int item : newArray) {
            System.out.print(item + " ");
        }
    }
    public static boolean trueFalse(int element, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element) {
                return true;
            }
        }
        return false;
    }
}
