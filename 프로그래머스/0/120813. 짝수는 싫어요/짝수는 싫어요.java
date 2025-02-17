import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> evenNum = new ArrayList<>();
        for(int i = 1; i<=n; i+=2){
            evenNum.add(i);
        }
        
        int [] answer = new int[evenNum.size()]; 
        int size = 0;
        
        for(int temp : evenNum){
            answer[size++] = temp;
        }
        return answer;
    }
}