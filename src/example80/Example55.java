package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:17
 */
public class Example55 {
    public static void main(String[] args) {
        String matn = "  Assalomu     alaykum      aziz  do'stlar  ";
        System.out.println(countWords(matn));
    }
    public static int countWords(String matn) {
        String[] words = matn.split(" ");
        int counter = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                counter++;
            }
        }
        return counter;
    }
}
