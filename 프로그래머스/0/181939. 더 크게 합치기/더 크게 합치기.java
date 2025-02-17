class Solution {
    public int solution(int a, int b) {
        
        int answer = 0;
        String strNum1 = Integer.toString(a) + Integer.toString(b);
        String strNum2 = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(strNum1)>Integer.parseInt(strNum2)){
            answer = Integer.parseInt(strNum1);
        } else if(Integer.parseInt(strNum1)<Integer.parseInt(strNum2)){
            answer = Integer.parseInt(strNum2);
        } else if(Integer.parseInt(strNum1)==Integer.parseInt(strNum2)){
            answer = Integer.parseInt(strNum1);
        }
        return answer;
    }
}