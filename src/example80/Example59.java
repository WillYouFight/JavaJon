package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:19
 */
public class Example59 {
    public static void main(String[] args) {
        String path = "C:/Begin/Begin1.java";
        String fileName = fileName(path);
        System.out.println(fileName);
    }
    public static String fileName(String path) {
        int slashIndex = path.lastIndexOf('/');
        int pointIndex = path.lastIndexOf('.');

        return path.substring(slashIndex + 1, pointIndex);
    }
}
