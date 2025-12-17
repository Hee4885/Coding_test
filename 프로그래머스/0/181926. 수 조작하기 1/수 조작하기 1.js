function solution(n, control) {
    var listScore = {
        "w": 1,
        "a": -10,
        "s": -1,
        "d": 10
    };

    for (let x of control) {
        if (x in listScore) {
            // listScore에서 값 찾아서 n에 넣기
            n += listScore[x];
        }
    }
    return n;
}