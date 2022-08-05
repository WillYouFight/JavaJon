package Array;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 27.06.2022_22:58
 */
public class Array75 {
    public static void main(String[] args) {
        array75(new int[]{3,4,5,6,1,3,2,5,7,8,12,11,3});
    }
    public static void array75(int[]array){
        int min =0;
        int max =0;
        for (int i = array.length-1; i >=0; i--) {
            if (array[i]>array[max]) max=i;
            else if (array[i]<array[min]) min=i;
        }
        if (max<min){
            max+=min;
            min=max-min;
            max=max-min;
        }
        for (int i = min; i <min+1+(max-min)/2; i++) {
            if (i!=(max-i+min)){
                array[i]+=array[max-i+min];
                array[max-i+min]=array[i]-array[max-i+min];
                array[i]=array[i]-array[max-i+min];
            }
        }
        ArrayUtil.show(array);
    }
}
