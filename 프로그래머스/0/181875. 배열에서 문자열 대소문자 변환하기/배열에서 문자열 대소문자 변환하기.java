class Solution {
    public String[] solution(String[] strArr) {
        String[] result = new String [strArr.length];
        for(int i = 0; i<strArr.length; i++){
            if(i%2==0){
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        
        for(int j = 0; j<result.length; j++){
            result[j] = strArr[j];
        }
        
        return result;
    }
}
