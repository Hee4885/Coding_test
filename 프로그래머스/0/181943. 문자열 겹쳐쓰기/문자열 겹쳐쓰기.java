class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        for(int i = 0; i<s; i++){
            answer += my_string.charAt(i);
        }
        answer += overwrite_string;
        int temp = overwrite_string.length() + s;
        if(temp < my_string.length()){
            for(int j = temp; j<my_string.length(); j++){
                answer += my_string.charAt(j);
            }
        }
        return answer;
    }
}