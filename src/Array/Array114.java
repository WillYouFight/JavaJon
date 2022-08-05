package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 28.06.2022_22:03
 */
public class Array114 {
    public static void main(String[] args) {
        int[]arik={7, 8, 5, 2, 4, 6, 3};//a.length=7
        Insertion (arik);//2,3,4,5,6,7,8
    }
    public static void Insertion(int []array){
        for (int i = 1; i < array.length; i++) {//i=1;2;3;
            int day = array[i];//day=8;5;2;
            int j = i - 1;//j=0;1;2;3;4;5;
            while (j >= 0 && array[j] > day) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = day;//day=8;day=5;day=2;day=4;day=6;day=3;
        }//arr[0]=2;arr[1]=3;arr[2]=4;arr[3]=5;arr[4]=6;arr[5]=7;arr[6]=8;
        ArrayUtil.show(array);
    }
}
