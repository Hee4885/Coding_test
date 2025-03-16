import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        double [] score = new double [N];

        for(int i = 0; i<N; i++){
            score[i] = sc.nextDouble();
        }
        
        double M = score[0];
        
        for(int i = 0; i<N; i++){
            if(score[i]>M){
                M = score[i];
            }
        }
        
        double result = 0;
        
        for(int i = 0; i<N; i++){
            score[i] = score[i]/M*100;
            result += score[i];

        }
        
        System.out.println((result/N));
    }
}