import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>sum = new ArrayList<>();
        
        int A,B;
        while(sc.hasNextInt()){
            A = sc.nextInt();
            B = sc.nextInt();
            if(A==0|B==0|A>=10|B>=10){
                break;
            }
            sum.add(A+B);
        }
        
        for(int Num : sum){
            System.out.println(Num);
        }
        sc.close();
    }
}