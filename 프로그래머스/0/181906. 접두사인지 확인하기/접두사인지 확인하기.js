function solution(my_string, is_prefix) {
    var answer = my_string.startsWith(is_prefix)? 1 : 0;
    return answer;
    
    /*
    [ 앞에 +가 무슨 표시인거지? ] 
        - boolean 앞에 + 해주면 true는 1, false는 0으로 변환해줍니다.
        - 문자열 string 앞에 +를 붙여서 +string 해주면 데이터 타입이 number로 바뀌어요
    */
}