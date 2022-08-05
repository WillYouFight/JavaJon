package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:21
 */
public class Example62 {
    public static void main(String[] args) {
        String path = "D:\\Qudrat_Abdurahimov\\book\\java_book.exe";
        System.out.println(fileExtension(path));
        String path1 = "D:\\java_book.exe";
        System.out.println(fileExtension(path1));
    }
    public static String fileExtension(String path) {
        int lastIndex =path.lastIndexOf("\\");
        int firstIndex =path.indexOf("\\");
        String newMatn =path.substring(0,lastIndex);
        int lastIndex1 =newMatn.lastIndexOf("\\");
        if (lastIndex==firstIndex){
            char f =path.charAt(firstIndex);
            return f+"";
        }
        return newMatn.substring(lastIndex1+1);
    }
}
