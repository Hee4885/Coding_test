def solution(numbers):
    answer = []
    numbers.sort()
    postiveS = numbers[0]*numbers[1]
    negativeS = numbers[-1]*numbers[-2]
    if postiveS>negativeS :
        answer = postiveS
    else :
        answer = negativeS
    return answer