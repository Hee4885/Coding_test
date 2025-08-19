def solution(numbers, direction):
    answer = []
    temp = 0
    if direction == "right".lower() :
        temp = numbers.pop()
        numbers.insert(0,temp)
    elif direction == "left".lower() :
        temp = numbers[0]
        del numbers[0]
        numbers.insert(len(numbers),temp)
    answer = numbers
    return answer