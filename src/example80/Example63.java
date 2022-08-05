package example80;

/**
 * project : Array
 * package : example80
 * author  : Allamuradov Tal'at
 * date    : 31.07.2022_22:22
 */
public class Example63 {
    public static void main(String[] args) {
        int s ='1';
        int s1 ='9';
        String matn = "abxy6878c";
        System.out.println(solution(matn));
        String matn1 = "a123b46c7d";
        System.out.println(solution(matn1));
    }
    public static char solution(String str){
        int a = 'a';
        int z = 'z';
        char[] matnArray = str.toCharArray();
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < matnArray.length; i++) {
            if (matnArray[i]>=a &&matnArray[i]<=z){
                int index =matnArray[i];
                if (max<index){
                    max=index;
                }else {
                    return matnArray[i];
                }
            }
        }
        return '0';
    }

}
