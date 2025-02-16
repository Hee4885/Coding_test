import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int plusM = sc.nextInt();
        
        M += plusM;
        if(M>=60){
            H += M/60;
            if(H>=24){
                H = H%24;
            } 
            M %= 60;
        } 
        
        System.out.println(H + " " + M);
        sc.close();
    }
}