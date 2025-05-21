class Solution {
    public int solution(int[] num_list) {
        //홀수
        String odd_num = "";
        //짝수
        String even_num = "";
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even_num += num_list[i];
            } else
                odd_num += num_list[i];
        }

        int answer = Integer.parseInt(odd_num) + Integer.parseInt(even_num);
        return answer;
    }
}