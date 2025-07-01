import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int max = 0;
        int answer = -1;
        boolean isSame = false;
        for (int num : array) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(int key : map.keySet()) {
            int k = map.get(key);
            if(k>max){
                max = k;
                answer = key;
                isSame = false;
            } else if(k == max){
                isSame = true;
            }
        }
        //같은 값이 여러 개 있으면 -1 반환
        return isSame ? -1: answer;
    }
}