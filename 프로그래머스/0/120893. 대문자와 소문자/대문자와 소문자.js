function solution(my_string) {
    var answer = '';
    for(let x of my_string){
        if(x===x.toLowerCase())
            answer += x.toUpperCase();
        else if (x===x.toUpperCase())
            answer += x.toLowerCase();
    }
    return answer;
}