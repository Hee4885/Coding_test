import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int leapYear = sc.nextInt();
        boolean isLeapYear = ((leapYear%4==0&&leapYear%100!=0)||(leapYear%400==0));
        System.out.println(isLeapYear? 1: 0);
    }
}