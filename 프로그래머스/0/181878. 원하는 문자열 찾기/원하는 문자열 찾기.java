class Solution {
    public int solution(String myString, String pat) {
        String myStr = myString.toLowerCase();
        String patStr = pat.toLowerCase();
        int answer = myStr.contains(patStr)? 1: 0;
        return answer;
    }
}