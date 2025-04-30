import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int originN = sc.nextInt();
        int N = originN;
        int newNum = 0;
        int count = 0;

        do{
            int n1 = N/10; //2 //6
            int n2 = N%10; //6 //8
            newNum = n1 + n2; //8 //14
            N = (n2*10) + (newNum%10); //60 + 8 =68 // 80 + 4 = 84
            count++;
        }while(N != originN); 
        
        System.out.println(count);
    }
}