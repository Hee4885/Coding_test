import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int [] arr = {n1,n2,n3};
        int max = n1;
        int result = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        
        if(n1==n2 && n2==n3){
            result = n1*1000+10000;
        } else if (n1==n2 || n1==n3 ){
            result = n1*100+1000;
        } else if(n2==n3){
            result = n2*100+1000;
        } else {
            result = max*100;
        }
        
        System.out.println(result);
    }
}