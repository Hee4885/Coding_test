class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int num = 0;
        
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'p' || c == 'P'){
                num++;
            } else if(c == 'y' || c == 'Y'){
                num--;
            }
        }
        

        if(num!=0){
            answer = false;
        }

        return answer; //리턴
    }
}