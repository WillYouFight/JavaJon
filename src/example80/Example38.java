package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 12.07.2022_16:59
 */
public class Example38 {
    public static void main(String[] args) {
        int[] test1 = {1,3,2,4,2,1,9,1};
        solution(test1);
    }
    public static void solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            boolean mavjud = false;
            for (int j = 0; j < i; j++) {
                if (element == array[j]){
                    mavjud=true;
                }
            }
            if (!mavjud) {
                System.out.println(element + " soni " + counter(element, array) + " ta");//1
            }
        }
    }
    public static int counter(int element, int[] array) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            if (element == array[j]){
                counter++;
            }
        }
        return counter;
    }
    public static int[] elka(int []array){
        int[]elka=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            elka[i]=array[i];
        }
        return elka;
    }
}
