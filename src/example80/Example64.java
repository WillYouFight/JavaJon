package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 30.07.2022_17:51
 */
public class Example64 {
    public static void main(String[] args) {
        String matn = "((())(()(";
        int openCount = 0;
        char open = '(';
        char closed = ')';
        int index = 0;
        int closedCount = 0;
        char[] arrayChar = matn.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            if (arrayChar[i] == open) {
                openCount++;
            } else {
                if (arrayChar[i] != open) {
                    i = arrayChar.length;
                }
            }
        }
        for (int i = openCount; i < arrayChar.length; i++) {
            if (arrayChar[i] == closed) {
                closedCount++;//3
                if (openCount > closedCount) {//t f
                    index = -1;
                } else {
                    if (openCount < closedCount) {
                        index = i-1;
                        i= arrayChar.length-1;
                    }
                }
            }
            if (arrayChar[i]==open){
                openCount++;//3
            }else {
                if (closedCount==openCount){
                    index=0;
                }
            }
        }
        System.out.println(index);
    }
}
