class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = n; i>=0; i-=2){
            answer = n%2==0? (answer+=i*i): (answer+=i);
        }
        return answer;
    }
}