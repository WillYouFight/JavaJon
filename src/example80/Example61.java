package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:20
 */
public class Example61 {
    public static void main(String[] args) {
        String path = "D:\\Qudrat_Abdurahimov\\book\\java_book.exe";
        System.out.println(fileExtension(path));
        String path1 = "D:\\java_book.exe"; // png
        System.out.println(fileExtension(path1));
    }
    public static String fileExtension(String path) {
        int firstIndex = path.indexOf('\\');
        int lastIndex =path.lastIndexOf("\\");
        String newMatn = path.substring(firstIndex + 1);
        int secondIndex = newMatn.indexOf("\\");
        if (firstIndex==lastIndex){
            return "/";
        }
        return newMatn.substring(0, secondIndex);
    }
}
