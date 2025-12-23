import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] nums = new int [n];
        int [] arr = new int [2];
        
        for(int i = 0; i<n; i++){
            nums[i] = i+1;
        }
        
        for(int i = 0; i<m; i++){
           int temp = 0;
           arr[0] = sc.nextInt();
           arr[1] = sc.nextInt();

           temp = nums[arr[0]-1];
           nums[arr[0]-1] = nums[arr[1]-1];
           nums[arr[1]-1] = temp;
        }
        
        for(int i = 0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}