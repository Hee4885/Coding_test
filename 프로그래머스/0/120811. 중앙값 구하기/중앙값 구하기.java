import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int indexNum = (array.length+1)/2-1;
        int answer = array[indexNum];
        return answer;
    }
}