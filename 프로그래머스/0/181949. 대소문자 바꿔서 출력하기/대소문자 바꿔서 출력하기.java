import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch;
        String result = "";
        
        for(int i = 0; i<str.length(); i++){
            ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            } else if(Character.isLowerCase(ch)){
                result += Character.toUpperCase(ch);
            }
        }
        
        System.out.print(result);
        
    }
}