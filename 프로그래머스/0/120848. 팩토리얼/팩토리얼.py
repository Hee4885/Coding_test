def solution(n):
    #10! 초과는 없다
    answer = []
    temp = 1
    for i in range(1,11) :
        for j in range(1,i+1) :
            temp *= j
        answer.append(temp)
        temp = 1
    for k in answer[::-1] :
        if n-k<0 :
            answer.remove(k)
    result = answer.index(max(answer))+1
    return result