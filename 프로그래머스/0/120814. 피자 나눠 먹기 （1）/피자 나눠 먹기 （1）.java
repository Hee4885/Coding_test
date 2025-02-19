class Solution {
    public int solution(int n) {
        int piece = 7;
        int answer = (n<=piece)? 1: (n%piece==0)? n/piece: (n/piece)+1;
        return answer;
    }
}