function solution(num_list) {
    var answer = [...num_list];
    var prev = answer[answer.length-2];
    var last = answer[answer.length-1];
    
    answer.push(last>prev? last-prev : last*2);
    return answer;
}