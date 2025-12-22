function solution(my_string, num1, num2) {
    // js 에서 string은 불변
    let answer = my_string.split("");
    [answer[num1],answer[num2]] = [answer[num2],answer[num1]];
    return answer.join("");
}