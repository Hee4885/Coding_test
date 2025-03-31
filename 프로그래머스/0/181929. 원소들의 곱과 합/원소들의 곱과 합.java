class Solution {
	public int solution(int[] num_list) {
    int answer = 0;
    double sum = 0;
    int mul = 1;
    for(int i = 0; i<num_list.length; i++){
        sum += num_list[i];
        mul *= num_list[i];
    }
    sum = Math.pow(sum,2);
    answer = (mul<sum)? 1 : 0;
        
    return answer;
    }
}