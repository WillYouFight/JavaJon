package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:20
 */
public class Example60 {
    public static void main(String[] args) {
        String path = "D:\\images\\book.png";
        String fileExtension = fileExtension(path);
        System.out.println(fileExtension);
    }
    public static String fileExtension(String path) {
        int pointIndex = path.lastIndexOf('.');
        return path.substring(pointIndex+1);
    }
}
