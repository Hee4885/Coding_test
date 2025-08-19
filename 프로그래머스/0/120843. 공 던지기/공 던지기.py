def solution(numbers, k):
    answer = []
    result = numbers*k
    temp = 0
    for i in range(0, len(result), 2) :
        answer.append(result[i])
        temp = i
        
    return answer[k-1]