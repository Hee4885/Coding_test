def solution(age):
    temp = str(age)
    answer = ""
    
    for i in range(len(temp)) :
        answer += chr(97+int(temp[i]))

        
    return answer