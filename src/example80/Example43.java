package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:15
 */
public class Example43 {

    public static void main(String[] args) {
        int[] test2 = {1,1,1,3,1,1,2,2,2,2,2};
        solution(test2);
    }
    public static void solution(int[] array) {
        int count =0;
        int[] b =new int[array.length];
        int[] c =new  int[array.length];
        b[count] =1;//
        c[count]=array[count];
        for (int i = 1 ; i < array.length; i++){
            if (array[i-1]==array[i]){
                b[count]++;
            }else {
                count++;//2;3
                b[count]=1;
                c[count]=array[i];
            }
        }
        for (int i = 0; i <=count; i++) {
            System.out.print(b[i]+" ");//
        }
        System.out.println();
        for (int i = 0; i <=count; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
