function solution(my_string, index_list) {
    // var answer = '';
    // for(let n of index_list){
    //     answer += my_string[n];
    // }
    
    var answer = index_list.map((n)=>(my_string[n])).join('');
    return answer;
}