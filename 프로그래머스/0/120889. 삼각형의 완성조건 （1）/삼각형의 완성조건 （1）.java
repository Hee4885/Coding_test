class Solution {
    public int solution(int[] sides) {
        int max = 0;
        int sum = 0;
        
        //가장 긴 변 찾기
        for(int i = 0; i<sides.length; i++){
            sum += sides[i];
            if(max<sides[i]){
                max = sides[i];
            }
        }
        
        return max<(sum-max)? 1 : 2;
    }
}