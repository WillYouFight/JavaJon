package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:18
 */
public class Example57 {
    public static void main(String[] args) {
        String matn = "assalomu Alaykum aziz  ";
        solution(matn);//
        System.out.println();
    }
    public static void solution(String matn) {
        String[] words = matn.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word = word.substring(0, 1).toUpperCase() + word.substring(1)+" ");
            }
        }
    }
}
