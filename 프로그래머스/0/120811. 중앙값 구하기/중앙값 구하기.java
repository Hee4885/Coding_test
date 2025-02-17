import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        //중앙값 구하는 공식 : {(자료의 개수)+1}/2 이지만, -1,+1이라는 계산식이 들어가므로 두 식은 제외
        int indexNum = array.length/2;
        int answer = array[indexNum];
        return answer;
    }
}