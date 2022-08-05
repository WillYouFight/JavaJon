package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:18
 */
public class Example58 {
    public static void main(String[] args) {
        String matn = "  Assalomu        alaykum     ";
        splitText(matn);
        System.out.println();
        String matn1 = "  Assalomu        alaykum   aziz   do`stlar  ";
        splitText (matn1);
    }
    public static void splitText(String matn) {
        String[] words = matn.split(" ");
        String newMatn="";
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word+" ");
            }
        }
    }
}
