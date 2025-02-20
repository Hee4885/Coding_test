import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>sum = new ArrayList<>();
        
        int A,B;
        do{
            A = sc.nextInt();
            B = sc.nextInt();
            if(A==0&&B==0){
                break;
            }
            sum.add(A+B);
        }while(A!=0&&B!=0);
        
        for(int Num : sum){
            System.out.println(Num);
        }
    }
}