package example80;

import arrayUtil.ArrayUtil;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 14.07.2022_21:30
 */
public class Example41 {
    public static void main(String[] args) {
        SelectionSort(new int[]{3, 9, 2, 5, 6, 3, 15});
    }
    public static void SelectionSort(int[]array){
        for (int i = 0; i < array.length-1; i++) {//i=0
            int minIndex = i;//i=0
            for (int j = i + 1; j < array.length; j++){//j=1
                if ( array[ j ] < array[ minIndex ] )//ar[1]<ar[0]F
                    minIndex = j;//min=2
        }
            int a = array[minIndex];//a=arr[2]=>
                array[minIndex] = array[i];
                array[i] = a;
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
