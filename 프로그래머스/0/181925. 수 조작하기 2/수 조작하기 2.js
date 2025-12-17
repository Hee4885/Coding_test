function solution(numLog) {
    var result = '';
    var listAlphabet = { "w" : 1, "a" : -10, "s" : -1, "d" : 10};
    
    //배열에서 현재 값 다음값이 배열에 있는 모든 숫자를 각각 더했을 때 그 중에 나온 값과 동일하다면 그 키값 넣기
    for(let i = 0; i<numLog.length; i++){
        for(let x in listAlphabet){
            if(numLog[i]+listAlphabet[x] === numLog[i+1]){
                result += x;
            }
        }
    }
    
    return result;
}