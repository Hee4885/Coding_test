class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strNum = Integer.toString(a) + Integer.toString(b);
        int num = Integer.parseInt(strNum);
        int mulNum = 2*a*b;
        
        if(num>mulNum || num == mulNum){
            answer = num;
        } else if(num<mulNum){
            answer = mulNum;
        }
        return answer;
    }
}