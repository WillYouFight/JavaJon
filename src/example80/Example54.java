package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 28.07.2022_21:38
 */
public class Example54 {
    public static void main(String[] args) {
        String matn = "Assalomu alaykum aziz do'stlar";
        String result = solution(matn);
        System.out.println(result);
    }
    public static String solution(String matn) {
        int firstProbelIndex = matn.indexOf (" ");
        int lastProbelIndex = matn.lastIndexOf(" ");
        if (firstProbelIndex == lastProbelIndex) {
            // matnda 1 ta probel bor ekan
            return "";
        }
        return matn.substring(firstProbelIndex+1, lastProbelIndex);
    }

}
