package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:17
 */
public class Example56 {
    public static void main(String[] args) {
        String matn = "  Assalomu   alaykum     ";
        minLength(matn);
    }
    public static void minLength(String matn) {
        String[] words = matn.split(" ");
        int min = Integer.MAX_VALUE;
        String newMatn="";
        for (String word : words) {//"" "" "Assalomu"
            if (!word.isEmpty() && min > word.length()) {
                min = word.length();
                newMatn=word;
            }
        }
        System.out.println(min+" "+newMatn);
    }
}
