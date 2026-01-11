function solution(my_string, index_list) {
    var answer = '';
    for(let n of index_list){
        answer += my_string[n];
    }
    return answer;
}