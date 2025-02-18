import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int [] sum = new int[T];
        int A,B;
        
        for(int i = 0; i<T; i++){
            A = sc.nextInt();
            B = sc.nextInt();
            sum[i] = A+B;
        }
        
        for(int i = 0; i<T; i++){
            System.out.printf("Case #%d: %d", (i+1), sum[i]);
            System.out.println();
        }
    }
}