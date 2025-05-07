class Solution {
    public int solution(String str1, String str2) {
        int answer = str1.contains(str2)? 1: 2;
        return answer;
        /* 문자열 안에서 특정 문자 검색하기
        1. indexOf : 특정 문자가 있는 index까지 반환
        2. contains : 특정 문자가 있는지 여부 확인
        3. matches : 정규식 형태를 찾기
        */
    }
}